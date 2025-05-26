#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

static bool comp(pair<string, ll>& a, pair<string, ll>& b) {
    return a.second <= b.second;
}

vector<pair<string, ll>> getAllDirectionsMap(const map<string, ll>& frequencyMap) {
    return {
        {"left", frequencyMap.count("left") ? frequencyMap.at("left") : 0},
        {"right", frequencyMap.count("right") ? frequencyMap.at("right") : 0},
        {"down", frequencyMap.count("down") ? frequencyMap.at("down") : 0},
        {"up", frequencyMap.count("up") ? frequencyMap.at("up") : 0}
    };
}

ll dist(const string& a, const string& b) {
    // Simplified distance calculation assuming a grid layout
    if (a == b) return 0;
    if ((a == "up" && b == "down") || (a == "down" && b == "up") ||
        (a == "left" && b == "right") || (a == "right" && b == "left"))
        return 1; // Only adjacent directions
    return 2; // Diagonal or non-adjacent
}

void solution() {
    ll n, finalans = LLONG_MAX;
    cin >> n;
    vector<string> in(n);
    map<string, ll> m;
    for (ll i = 0; i < n; ++i) {
        cin >> in[i];
        m[in[i]]++;
    }

    vector<pair<string, ll>> sorter = getAllDirectionsMap(m);
    sort(sorter.begin(), sorter.end(), comp);

    vector<pair<string, string>> footpairs = {
        {"left", "right"}, {"right", "left"}, {"left", "down"}, {"down", "left"},
        {"left", "up"}, {"up", "left"}, {"right", "down"}, {"down", "right"},
        {"right", "up"}, {"up", "right"}, {"down", "up"}, {"up", "down"}
    };

    do {
        for (auto& foot : footpairs) {
            string f1 = foot.first, f2 = foot.second;
            ll ans = 0;
            string currentF1 = f1, currentF2 = f2;
            for (auto& x : in) {
                if (x == currentF1 || x == currentF2) continue;
                if (dist(x, currentF1) < dist(x, currentF2)) {
                    currentF1 = x;
                } else {
                    currentF2 = x;
                }
                ans++;
            }
            finalans = min(finalans, ans);
        }
    } while (next_permutation(sorter.begin(), sorter.end(), comp));

    cout << finalans << endl;
}

int main() {
    solution();
    return 0;
}
