import java.util.*;

public class Combinatorics {
    // Modulo constant
    static final int MOD = 1_000_000_007;
    static final int MAX = 1_000_000; // Adjust based on the problem constraints

    // Arrays to store factorials and modular inverses
    static long[] fact = new long[MAX + 1];
    static long[] invFact = new long[MAX + 1];

    public static void main(String[] args) {
        // Precompute factorials and inverses
        precomputeFactorials();

        // Example usage
        int n = 10, r = 3;

        System.out.println("C(" + n + ", " + r + ") = " + combination(n, r));
        System.out.println("P(" + n + ", " + r + ") = " + permutation(n, r));
    }

    // Precomputes factorials and modular inverses up to MAX
    static void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }
        invFact[MAX] = modInverse(fact[MAX], MOD);
        for (int i = MAX - 1; i >= 0; i--) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;
        }
    }

    // Computes nCr (combination) modulo MOD
    static long combination(int n, int r) {
        if (r > n || r < 0) return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    // Computes nPr (permutation) modulo MOD
    static long permutation(int n, int r) {
        if (r > n || r < 0) return 0;
        return fact[n] * invFact[n - r] % MOD;
    }

    // Computes modular inverse using Fermat's Little Theorem
    static long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    // Computes a^b % mod using binary exponentiation
    static long power(long a, long b, int mod) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return result;
    }
}
