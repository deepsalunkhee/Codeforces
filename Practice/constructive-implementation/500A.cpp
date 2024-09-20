#include<bits/stdc++.h>
using namespace std;

void solution(){
    int n, t;
    cin >> n >> t;
    vector<int> in(n); // portals

    for(int i = 1; i < n; i++) {
        cin >> in[i];
    }

    vector<bool> visited(n, false); // To keep track of visited cells
    queue<int> q;
    q.push(1); // Start from cell 1
    visited[1] = true;

    while(!q.empty()) {
        int current = q.front();
        q.pop();

        if (current == t) {
            cout << "YES" << endl;
            return;
        }

        int nextCell = current + in[current];
        if (nextCell <= n && !visited[nextCell]) {
            q.push(nextCell);
            visited[nextCell] = true;
        }
    }

    cout << "NO" << endl;
}

int main() {
    solution();
    return 0;
}
