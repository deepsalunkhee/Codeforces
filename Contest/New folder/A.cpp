#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int gcd(int a, int b) {
    while (b) {
        a %= b;
        swap(a, b);
    }
    return a;
}

int countMaxOperations(int l, int r) {
    vector<int> s;
    
    for (int i = l; i <= r; i++) {
        s.push_back(i);
    }
    
    int si=s.size();
    
    int operations = 0;
    for (int i = si-1; i >=0; i--) {
        for (int j = i - 1; j>=0; j--) {
            for (int k = j - 1; k >=0; k--) {
                if (gcd(s[i], s[j]) == 1 && gcd(s[j], s[k]) == 1 && gcd(s[i], s[k]) == 1) {
                    // Found a valid triplet
                    cout<<s[i]<<s[j]<<s[k]<<endl;
                    operations++;
                    s.erase(s.begin() + k);
                    s.erase(s.begin() + j);
                    s.erase(s.begin() + i);
                    i = -1;  // Reset the loop as the array size changed
                    break;
                }
            }
            if (i == -1) break;
        }
    }
    
    return operations;
}

int main() {
    int t;
    cin >> t;
    
    while (t--) {
        int l, r;
        cin >> l >> r;
        
        int result = countMaxOperations(l, r);
        cout << result << endl;
    }
    
    return 0;
}
