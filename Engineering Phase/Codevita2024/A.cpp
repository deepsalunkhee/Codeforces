#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool isReachable(vector<vector<ll>> po, vector<ll>& rolls, ll des) {
    ll pos = 1; // Starting position
    ll c=0;
    for (ll roll : rolls) {
        pos += roll;
        c++;
        if (pos > 100) return false; // Can't go beyond 100

        // Apply snake/ladder effects
        for (auto& p : po) {
            if (pos == p[0]) {
                pos = p[1];
                break;
            }
        }

       
    }
    // Final position check
    return pos == des;
}

void solution() {
    ll n;
    cin >> n;

    vector<vector<ll>> po(n, vector<ll>(2));
    for (ll i = 0; i < n; i++) {
        cin >> po[i][0] >> po[i][1];
    }

    // Read dice rolls
    string rollsLine;
    cin.ignore();
    getline(cin, rollsLine);
    istringstream iss(rollsLine);
    vector<ll> rolls;
    ll roll;
    while (iss >> roll) {
        rolls.push_back(roll);
    }
    
    //ll rollcount=rolls.size();

    ll des;
    cin >> des;

    // Ensure the final destination isn't a snake/ladder cell
    

    // Check if the path is already valid
    if (isReachable(po, rolls, des)) {
        cout << "Not affected";
        return;
    }

    // Try switching each snake/ladder
    for (ll i = 0; i < n; i++) {
        swap(po[i][0], po[i][1]); // Switch snake to ladder or ladder to snake

        if (isReachable(po, rolls, des)) {
            if (po[i][0] < po[i][1]) {
                cout << "Ladder " << po[i][0] << " " << po[i][1];
            } else {
                cout << "Snake " << po[i][0] << " " << po[i][1];
            }
            return;
        }

        swap(po[i][0], po[i][1]); // Revert switch
    }

    // If no solution is found
    cout << "Not reachable";
}

int main() {
    solution();
    return 0;
}
