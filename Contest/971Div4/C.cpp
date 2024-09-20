#include <iostream>
#include <algorithm>
using namespace std;

void solution() {
    int x, y, k;
    cin >> x >> y >> k;
    
    int a1 = x / k;
    int x_rem = x % k;
    int a2 = y / k;
    int y_rem = y % k;

    int ans = 2 * max(a1, a2);

    if (a1 > a2) {
        ans -= 1;
    }

    if (y_rem && x_rem && a1 > a2) {
        ans += 2;
    } else if (y_rem && a1 > a2) {
        ans += 1;
    } else if (y_rem) {
        ans += 2;
    } else if (x_rem) {
        ans += 1;
    }

    cout << ans << endl;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        solution();
    }

    return 0;
}