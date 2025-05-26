#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    vector<pair<int, int>> red, blue;
    for (int i = 0; i < n; i++) {
        int x, u;
        cin >> x >> u;
        red.emplace_back(x, u);
    }
    for (int i = 0; i < m; i++) {
        int y, v;
        cin >> y >> v;
        blue.emplace_back(y, v);
    }

    int collisions = 0;
    for (size_t i = 0; i < red.size(); i++) {
        for (size_t j = 0; j < blue.size(); j++) {
            double t = (double)(blue[j].first - red[i].first) / (red[i].second + blue[j].second);
            if (t >= 0 && t <= 1) {
                collisions++;
                red.erase(red.begin() + i);
                blue.erase(blue.begin() + j);
                i--;
                j--;
                break;
            }
        }
    }

    cout << collisions << endl;
    return 0;
}