import java.util.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the target string and dictionary size
        String s = sc.next();
        int k = sc.nextInt();

        // Initialize the Trie and insert words
        Trie trie = new Trie();
        for (int i = 0; i < k; i++) {
            String word = sc.next();
            trie.insert(word);
        }

        // Dynamic Programming Array
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: one way to form an empty string

        // Fill DP Array using the Trie
        for (int i = 0; i < n; i++) {
            if (dp[i] == 0) continue; // Skip if no way to form substring up to i
            List<Integer> ends = Trie.searchPrefix(s, i);
            for (int end : ends) {
                dp[end] = (dp[end] + dp[i]) % MOD;
            }
        }

        // Output the result
        System.out.println(dp[n]);
    }
}

class Trie {
    static Node root;

    Trie() {
        root = new Node();
    }

    // Inserts a word into the Trie
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
    }

    // Searches for a word in the Trie
    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.isEnd;
    }

    // Checks if any word in the Trie starts with the given prefix
    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    // Returns all valid end indices of prefixes starting from index 'start'
    public static List<Integer> searchPrefix(String s, int start) {
        List<Integer> result = new ArrayList<>();
        Node curr = root;

        for (int i = start; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (curr.children[index] == null) {
                break; // No further matches
            }
            curr = curr.children[index];
            if (curr.isEnd) {
                result.add(i + 1); // Store the index after the end of this prefix
            }
        }

        return result;
    }
}

class Node {
    Node[] children = new Node[26];
    boolean isEnd;

    Node() {
        isEnd = false;
        Arrays.fill(children, null);
    }
}
