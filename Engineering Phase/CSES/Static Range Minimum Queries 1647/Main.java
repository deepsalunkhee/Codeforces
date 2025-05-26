import java.io.*;
import java.util.*;

class SegmentTree {
        private long[] tree;
        private int n;

        public SegmentTree(int[] arr) {
            n = arr.length;
            // Use long to handle larger sums
            tree = new long[4 * n];
            build(arr, 0, 0, n - 1);
        }

        private void build(int[] arr, int node, int start, int end) {
            // Base case: leaf node
            if (start == end) {
                tree[node] = arr[start];
                return;
            }

            // Recursive case
            int mid = (start + end) / 2;
            // Left subtree
            build(arr, 2 * node + 1, start, mid);
            // Right subtree
            build(arr, 2 * node + 2, mid + 1, end);

            // Current node is sum of its children
            tree[node] = Math.min(tree[2 * node + 1],  tree[2 * node + 2]);
        }

        public long query(int node, int start, int end, int left, int right) {
            // No overlap
            if (right < start || left > end) {
                return Integer.MAX_VALUE;
            }

            // Complete overlap
            if (left <= start && end <= right) {
                return tree[node];
            }

            // Partial overlap
            int mid = (start + end) / 2;
            long leftSum = query(2 * node + 1, start, mid, left, right);
            long rightSum = query(2 * node + 2, mid + 1, end, left, right);

            return Math.min(leftSum , rightSum);
        }
    }
    
    class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // Read first line: n and q
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        // Read array
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // Create segment tree
        SegmentTree segTree = new SegmentTree(arr);

        // Process queries
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1; // 0-based indexing
            int b = Integer.parseInt(st.nextToken()) - 1; // 0-based indexing

            // Calculate and write sum for the query range
            long sum = segTree.query(0, 0, n - 1, a, b);
            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        // Flush and close
        bw.flush();
        bw.close();
    }
}
