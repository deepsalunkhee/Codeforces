#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <climits>

using namespace std;

typedef long long ll;

ll cost(const string& a, const string& b) {
    return (a == b) ? 0 : 1;
}

ll solve(ll M, const vector<string>& steps) {
    vector<string> directions = {"up", "down", "left", "right"};
    ll result = LLONG_MAX;

    do {
        for (ll x = 0; x < directions.size(); ++x) {
            for (ll y = 0; y < directions.size(); ++y) {
                string f1 = directions[x];
                string f2 = directions[y];
                ll total_moves = 0;

                for (const auto& step : steps) {
                    ll move1 = cost(f1, step);
                    ll move2 = cost(f2, step);

                    if (move1 <= move2) {
                        f1 = step;
                        total_moves += move1;
                    } else {
                        f2 = step;
                        total_moves += move2;
                    }
                }

                result = min(result, total_moves);
            }
        }
    } while (next_permutation(directions.begin(), directions.end()));

    return result;
}

int main() {
    ll M;
    cin >> M;
    vector<string> steps(M);

    for (ll i = 0; i < M; ++i) {
        cin >> steps[i];
    }

    cout << solve(M, steps) << endl;

    return 0;
}
