#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define MOD 1000000007

void solution(){
    ll n;
    cin >> n;
    ll ans = 1;
    ll base = 2;  // Start with the base as 2 since we're calculating 2^n

    while (n > 0) {
        if (n % 2 == 1) {
            ans = (ans * base) % MOD;  // Multiply ans by base if n is odd
            n--;  // Decrease n by 1 if it's odd
        } else {
            base = (base * base) % MOD;  // Square the base if n is even
            n /= 2;  // Divide n by 2
        }
    }
    cout << ans << endl;
}

int main(){
    solution();
    return 0;
}
