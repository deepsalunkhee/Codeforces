import java.util.*;
import java.io.*;

class Main1 {
    static Scanner sc = new Scanner(System.in);
    static final int MOD = 1_000_000_007;

    // Trie Node class
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    // Insert a word into Trie
    static void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public static void solution() {
        // Read input
        String s = sc.next();
        int sl = s.length();
        int k = sc.nextInt();

        // Create Trie root
        TrieNode root = new TrieNode();

        // Insert dictionary words into Trie
        String[] dictionary = new String[k];
        for (int i = 0; i < k; i++) {
            dictionary[i] = sc.next();
            insert(root, dictionary[i]);
        }

        // DP array to store number of ways
        long[] dp = new long[sl + 1];
        dp[0] = 1; // Empty string has 1 way

        // Fill DP table
        for (int i = 1; i <= sl; i++) {
            // Check for word matches using Trie
            for (int j = 0; j < i; j++) {
                String substr = s.substring(j, i);
                if (searchWord(root, substr)) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }

        // Print final result
        System.out.println(dp[sl]);
    }

    // Search for a word in Trie
    static boolean searchWord(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public static void main(String[] args) {
        solution();
    }
}