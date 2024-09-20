#include <iostream>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    
    // The minimum number of moves needed (all 2-steps if possible)
    int min_moves = (n + 1) / 2;
    
    // Find the smallest number of moves which is a multiple of m
    while (min_moves <= n) {
        if (min_moves % m == 0) {
            cout << min_moves << endl;
            return 0;
        }
        min_moves++;
    }
    
    // If no valid move count found
    cout << -1 << endl;
    return 0;
}
