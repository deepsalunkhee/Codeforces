import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    private static void printInt(int a){
        System.out.print(a);
    }
    
    private static void printChar(char a){
        System.out.print(a);
    }
    
    private static void printString(String a){
        System.out.print(a);
    }
    
    private static void ln(){
        System.out.println();
    }
    
    private static void print2dArr(char[][] arr, int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            ln();
        }
    }

    private static void print1dArr(long[] arr, long r){
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        ln();
    }

    private static void exploreComponents2(int node, Map<Integer, List<Integer>> graph2, 
            boolean[] visited2, int[] component, int groupId) {
        component[node] = groupId;
        visited2[node] = true;
        
        for (int neighbor : graph2.getOrDefault(node, new ArrayList<>())) {
            if (!visited2[neighbor]) {
                exploreComponents2(neighbor, graph2, visited2, component, groupId);
            }
        }
    }
    
    private static void exploreGraph1(int node, Map<Integer, List<Integer>> graph1, 
            boolean[] visited1, Map<Pair, Integer> edgeMap) {
        visited1[node] = true;
        
        for (int neighbor : graph1.getOrDefault(node, new ArrayList<>())) {
            if (!visited1[neighbor] && edgeMap.getOrDefault(new Pair(node, neighbor), 0) != 1) {
                exploreGraph1(neighbor, graph1, visited1, edgeMap);
            }
        }
    }
    
    public static void solution() {
        int n = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        
        int componentCount = 0;
        int isolatedCount = 0;
        Map<Pair, Integer> edgeMap = new HashMap<>();
        
        Map<Integer, List<Integer>> graph1 = new HashMap<>();
        Map<Integer, List<Integer>> graph2 = new HashMap<>();
        boolean[] visited1 = new boolean[n];
        boolean[] visited2 = new boolean[n];
        int[] component = new int[n];
        Arrays.fill(component, -1);
        
        // Input edges for the first graph
        for (int i = 0; i < m1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            graph1.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph1.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        // Input edges for the second graph
        for (int i = 0; i < m2; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            graph2.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph2.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        // Explore components in the second graph
        for (int i = 0; i < n; i++) {
            if (!visited2[i]) {
                componentCount++;
                exploreComponents2(i, graph2, visited2, component, componentCount);
            }
        }
        
        int totalEdges = 0;
        // Explore edges in the first graph and count valid connections
        for (int i = 0; i < n; i++) {
            for (int neighbor : graph1.getOrDefault(i, new ArrayList<>())) {
                if (component[i] != component[neighbor]) {
                    totalEdges++;
                    edgeMap.put(new Pair(i, neighbor), 1);
                }
            }
        }
        
        // Explore the first graph to count isolated groups
        for (int i = 0; i < n; i++) {
            if (!visited1[i]) {
                isolatedCount++;
                exploreGraph1(i, graph1, visited1, edgeMap);
            }
        }
        
        printInt(totalEdges / 2 + (isolatedCount - componentCount));
        ln();
    }

    public static void main(String[] args) {
        long t = sc.nextLong();
        
        while (t-- > 0) {
            solution();
        }
    }
    
    // Helper class to store edge pairs
    static class Pair {
        int first, second;
        
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return (first == pair.first && second == pair.second) ||
                   (first == pair.second && second == pair.first);
        }
        
        @Override
        public int hashCode() {
            return Integer.hashCode(Math.min(first, second)) * 31 + 
                   Integer.hashCode(Math.max(first, second));
        }
    }
}
