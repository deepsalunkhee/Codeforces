#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<long long> solve(int n, int k, vector<int>& c) {
    vector<int> s = c;
    sort(s.begin(), s.end());
    
    vector<long long> res(n);
    for(int m = 1; m <= n; m++) {
        long long sum = 0;
        for(int i = 0; i < m; i++) {
            sum += s[i];
        }
        
        int g = m / (k + 1);  // groups
        int r = m % (k + 1);  // remaining
        
        long long mc = sum;  // min_cost
        int cnt = 0;
        long long rs = 0;    // running_sum
        
        // Process complete groups
        for(int i = m - 1; i >= 0 && g > 0; i -= (k + 1)) {
            for(int j = 0; j < k && i - j >= 0; j++) {
                rs += s[i - j];
            }
            cnt += k + 1;
            g--;
        }
        
        // Add remaining items
        if(r > 0) {
            for(int i = m - cnt - 1; i >= 0 && r > 0; i--) {
                rs += s[i];
                r--;
            }
        }
        
        res[m-1] = min(mc, rs);
    }
    
    return res;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin >> t;
    
    while(t--) {
        int n, k;
        cin >> n >> k;
        
        vector<int> c(n);
        for(int i = 0; i < n; i++) {
            cin >> c[i];
        }
        
        vector<long long> res = solve(n, k, c);
        
        for(int i = 0; i < n; i++) {
            cout << res[i] << (i < n-1 ? " " : "\n");
        }
    }
    
    return 0;
}