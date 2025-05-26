#include<bits/stdc++.h>
using namespace std;
#define ll long long

bool isValidTree(int n, int d, int l) {
    // Ensure constraints are valid
    if (d + 1 > n || l < 2 || l > n) return false;
    return (l <= n - d + 1);
}



void solution() {
    ll n, d, l;
    cin >> n >> d >> l;

    if (!isValidTree(n, d, l)) {
        cout << -1 << endl;
        return;
    }

    vector<pair<int, int>> edges;
    int nextNode = 2;

    // Build the diameter (path of length d)
    for (int i = 1; i <= d; ++i) {
        edges.push_back({i, nextNode});
        nextNode++;
    }

    int remainingLeaves = l - 2; // Leaves minus two endpoints of the diameter
    int remainingNodes = n - (d + 1);

    // Attach remaining leaves to the path
    for (int i = 2; i <= d && remainingLeaves > 0; ++i) {
        edges.push_back({i, nextNode});
        nextNode++;
        remainingLeaves--;
        remainingNodes--;
    }

    // Attach other remaining nodes as regular nodes
    for (int i = 1; i <= d && remainingNodes > 0; ++i) {
        while (remainingNodes > 0) {
            edges.push_back({i, nextNode});
            nextNode++;
            remainingNodes--;
        }
    }

    // Output the edges
    for (const auto& edge : edges) {
        cout << edge.first << " " << edge.second << endl;
    }
}

int main() {
    ll t;
    cin >> t;
    while (t--) solution();
    return 0;
}
