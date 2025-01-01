import java.util.ArrayList;
import java.util.List;

public class Main {
    // Method to find all occurrences of the pattern in the text
    public static List<Integer> search(String text, String pattern) {
        String combined = pattern + "$" + text; // Concatenate pattern and text with a unique separator
        int[] z = calculateZArray(combined);   // Calculate Z-array
        List<Integer> result = new ArrayList<>();

        int patternLength = pattern.length();
        for (int i = patternLength + 1; i < combined.length(); i++) {
            if (z[i] == patternLength) { // Match found
                result.add(i - patternLength - 1); // Adjust index for the text
            }
        }
        return result;
    }

    // Method to calculate the Z-array
    private static int[] calculateZArray(String s) {
        int n = s.length();
        int[] z = new int[n];
        int left = 0, right = 0;

        for (int i = 1; i < n; i++) {
            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }
        return z;
    }

    // Main method for testing
    public static void main(String[] args) {
        String text = "ababcababcababc";
        String pattern = "ababc";
        List<Integer> result = search(text, pattern);

        System.out.println("Pattern found at indices: " + result);
    }
}
