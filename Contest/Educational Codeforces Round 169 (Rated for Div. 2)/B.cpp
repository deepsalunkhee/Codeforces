#include <bits/stdc++.h>
using namespace std;

void solution() {
    int l1, r1, l2, r2;
    cin >> l1 >> r1 >> l2 >> r2;

    // Ensure [l1,r1] is the leftmost segment
    if (l2 < l1) {
        swap(l1, l2);
        swap(r1, r2);
    }

    if (r1 < l2) {
        // Segments don't overlap, need to lock 1 door
        cout << 1 << endl;
    } else if (r1 > r2) {
        // One segment completely contains the other
        cout << r2 - l2 + 2 << endl;
    } else if (l1 == l2 && r1 == r2) {
        // Segments are identical
        cout << r2 - l2 << endl;
    } else {
        // Segments partially overlap
        cout << min(r1 - l1 + 1, r2 - l2 + 1) << endl;
    }
}

int main() {
    

    int T;
    cin >> T;
    while (T--) {
        solution();
    }

    return 0;
}
