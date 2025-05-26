#include <iostream>
#include <vector>
using namespace std;

const int MOD = 998244353;

// Fast exponentiation modulo MOD
long long mod_exp(long long base, long long exp, int mod) {
    long long res = 1;
    while (exp) {
        if (exp % 2) res = res * base % mod;
        base = base * base % mod;
        exp /= 2;
    }
    return res;
}

int main() {
    int t;
    cin >> t;
    vector<long long> ns(t);
    for (int i = 0; i < t; i++) cin >> ns[i];

    for (long long n : ns) {
        long long res = 0, p10 = 1;  // p10 is the power of 10 mod MOD
        long long start = 1;

        while (start <= n) {
            long long end = min(n, 2 * start - 1);
            long long len = 64 - __builtin_clzll(start); // Binary length of 'start'
            long long cnt = end - start + 1;

            // Sum of numbers in range [start, end]
            long long sum = cnt * (start + end) / 2 % MOD;

            // Add to result
            res = (res + sum * p10 % MOD) % MOD;

            // Update p10 for next range
            p10 = p10 * mod_exp(10, cnt * len, MOD) % MOD;

            // Move to next range
            start = end + 1;
        }

        cout << res << endl;
    }

    return 0;
}
