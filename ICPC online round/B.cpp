#include <iostream>
#include <vector>
using namespace std;

void solve() {
    int t;
    cin >> t;
    while (t--) {
        int n, d, l;
        cin >> n >> d >> l;

        // Early impossible checks
        if (l > n || d >= n || l < (d + 1)) {
            cout << "-1\n";
            continue;
        }

        // Create the spine of the tree (diameter d)
        vector<pair<int, int>> edges;
        for (int i = 1; i <= d; ++i) {
            edges.push_back({i, i + 1});
        }

        int leaves_added = 0;
        int nodes_used = d + 1; // Nodes in the spine
        int left_ptr = 2, right_ptr = d;

        // Attach leaves symmetrically from both ends of the spine
        while (leaves_added < l - (d - 1) && nodes_used < n) {
            if (left_ptr <= right_ptr) {
                edges.push_back({left_ptr, ++nodes_used});
                ++leaves_added;
                if (left_ptr < right_ptr && nodes_used < n) {
                    edges.push_back({right_ptr, ++nodes_used});
                    ++leaves_added;
                }
                ++left_ptr;
                --right_ptr;
            } else {
                break;
            }
        }

        // Handle case where we need to continue adding nodes but have no leaves
        for (int i = 2; i <= d && nodes_used < n; ++i) {
            while (nodes_used < n) {
                edges.push_back({i, ++nodes_used});
                ++leaves_added;
                if (leaves_added >= l) break;
            }
        }

        // If still nodes remain to be added, it's impossible
        if (nodes_used < n) {
            cout << "-1\n";
        } else {
            for (auto [u, v] : edges) {
                cout << u << " " << v << "\n";
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    solve();
    return 0;
}