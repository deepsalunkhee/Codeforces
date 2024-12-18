import java.util.*;
 

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

public class Main {
    
 
    public static void main(String[] args) {
       
    }
}
 
