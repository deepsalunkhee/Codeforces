import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // consume newline
        
        while (t-- > 0) {
            String s = sc.nextLine();
            int[] result = findMaxXORSubstrings(s);
            System.out.println(result[0] + " " + result[1] + " " + 
                             result[2] + " " + result[3]);
        }
    }
    
    static int[] findMaxXORSubstrings(String s) {
        int n = s.length();
        
        // If string contains only 1s, return [1,n] and [1,1]
        boolean allOnes = true;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                allOnes = false;
                break;
            }
        }
        if (allOnes) {
            return new int[]{1, n, 1, 1};
        }
        
        // Find position of first 0
        int p = 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                p = i + 1;
                break;
            }
        }
        
        // The first substring will always be [1,n]
        int len = n - p + 1;
        String maxXORString = "";
        int bestStart = 1;
        
        // Try all possible starting positions for second substring
        for (int start = 1; start <= n - len + 1; start++) {
            String substr2 = s.substring(start - 1, start + len - 1);
            
            // Calculate XOR value
            String xorString = calculateBinaryXOR(s.substring(p - 1), substr2);
            
            // Update if we found a better result (comparing binary strings lexicographically)
            if (maxXORString.isEmpty() || compareBinaryStrings(xorString, maxXORString) > 0) {
                maxXORString = xorString;
                bestStart = start;
            }
        }
        
        return new int[]{1, n, bestStart, bestStart + len - 1};
    }
    
    // Calculate XOR of two binary strings directly
    static String calculateBinaryXOR(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int maxLen = Math.max(s1.length(), s2.length());
        
        // Pad the shorter string with zeros on the left
        s1 = String.format("%" + maxLen + "s", s1).replace(' ', '0');
        s2 = String.format("%" + maxLen + "s", s2).replace(' ', '0');
        
        // Calculate XOR bit by bit
        for (int i = 0; i < maxLen; i++) {
            result.append(s1.charAt(i) == s2.charAt(i) ? '0' : '1');
        }
        
        return result.toString();
    }
    
    // Compare two binary strings
    static int compareBinaryStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return s1.length() - s2.length();
        }
        return s1.compareTo(s2);
    }
}
