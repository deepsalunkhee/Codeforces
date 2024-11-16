#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class DSU {
private:
    vector<int> p, r;
public:
    DSU(int n) : p(n + 1), r(n + 1, 0) {
        for(int i = 0; i <= n; i++) p[i] = i;
    }
    
    int find(int x) {
        return p[x] == x ? x : p[x] = find(p[x]);
    }
    
    void unite(int x, int y) {
        int px = find(x), py = find(y);
        if(px == py) return;
        if(r[px] < r[py]) p[px] = py;
        else if(r[px] > r[py]) p[py] = px;
        else {
            p[py] = px;
            r[px]++;
        }
    }
};

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    int t;
    cin >> t;
    
    while(t--) {
        int n;
        cin >> n;
        
        vector<int> x(n + 1), a(n + 1);
        vector<pair<long long, pair<int, int>>> e;
        e.reserve(n * (n - 1) / 2);
        
        for(int i = 1; i <= n; i++) cin >> x[i];
        for(int i = 1; i <= n; i++) cin >> a[i];
        
        for(int i = 1; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                long long w = min(a[i], a[j]) * 1LL * abs(x[i] - x[j]);
                e.push_back({w, {i, j}});
            }
        }
        
        sort(e.begin(), e.end());
        
        DSU d(n);
        long long ans = 0;
        
        for(auto &i : e) {
            int u = i.second.first;
            int v = i.second.second;
            if(d.find(u) != d.find(v)) {
                ans += i.first;
                d.unite(u, v);
            }
        }
        
        cout << ans << '\n';
    }
    return 0;
}