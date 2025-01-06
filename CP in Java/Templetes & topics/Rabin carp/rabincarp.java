import java.util.ArrayList;
import java.util.List;

public class Main {
    // Function to find all occurrences of pattern in the text using double hashing
    public static List<Integer> rabinKarp(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        List<Integer> result = new ArrayList<>();

        // Base primes for double hashing
        int base1 = 31, base2 = 37;
        // Large prime modulus to reduce hash collisions
        int mod1 = 1_000_000_007, mod2 = 998_244_353;

        // Calculate the hash of the pattern
        long patternHash1 = 0, patternHash2 = 0;
        long textHash1 = 0, textHash2 = 0;

        // Precompute powers of bases
        long power1 = 1, power2 = 1;
        for (int i = 0; i < m; i++) {
            power1 = (power1 * base1) % mod1;
            power2 = (power2 * base2) % mod2;
        }

        // Calculate the initial hash for the pattern and the first window of the text
        for (int i = 0; i < m; i++) {
            patternHash1 = (patternHash1 * base1 + pattern.charAt(i)) % mod1;
            patternHash2 = (patternHash2 * base2 + pattern.charAt(i)) % mod2;
            textHash1 = (textHash1 * base1 + text.charAt(i)) % mod1;
            textHash2 = (textHash2 * base2 + text.charAt(i)) % mod2;
        }

        // Sliding window over the text
        for (int i = 0; i <= n - m; i++) {
            // If hashes match, check characters to confirm
            if (textHash1 == patternHash1 && textHash2 == patternHash2) {
                if (text.substring(i, i + m).equals(pattern)) {
                    result.add(i);
                }
            }

            // Update the hash for the next window
            if (i < n - m) {
                textHash1 = (textHash1 * base1 - text.charAt(i) * power1 % mod1 + mod1) % mod1;
                textHash1 = (textHash1 + text.charAt(i + m)) % mod1;

                textHash2 = (textHash2 * base2 - text.charAt(i) * power2 % mod2 + mod2) % mod2;
                textHash2 = (textHash2 + text.charAt(i + m)) % mod2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "abracadabra";
        String pattern = "abra";

        List<Integer> occurrences = rabinKarp(text, pattern);
        System.out.println("Pattern found at indices: " + occurrences);
    }
}
