public class FenwickTree {
    private int[] fenwickTree;

    // Constructor to initialize the Fenwick Tree with size n
    public FenwickTree(int size) {
        fenwickTree = new int[size + 1]; // Fenwick Tree is 1-indexed
    }

    // Update the Fenwick Tree: Add 'value' to the element at index 'index'
    public void update(int index, int value) {
        while (index < fenwickTree.length) {
            fenwickTree[index] += value;
            index += index & -index; // Move to the next index
        }
    }

    // Query the prefix sum from 1 to 'index'
    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += fenwickTree[index];
            index -= index & -index; // Move to the parent index
        }
        return sum;
    }

    // Range query: Get the sum of elements from 'left' to 'right'
    public int rangeQuery(int left, int right) {
        return query(right) - query(left - 1);
    }

    // Main method for testing the Fenwick Tree
    public static void main(String[] args) {
        int n = 5; // Example size
        FenwickTree ft = new FenwickTree(n);

        // Example array: [1, 2, 3, 4, 5]
        int[] arr = {1, 2, 3, 4, 5};

        // Build the Fenwick Tree
        for (int i = 0; i < n; i++) {
            ft.update(i + 1, arr[i]); // 1-indexed
        }

        // Test queries
        System.out.println("Prefix sum up to index 3: " + ft.query(3)); // Output: 6 (1+2+3)
        System.out.println("Range sum from index 2 to 4: " + ft.rangeQuery(2, 4)); // Output: 9 (2+3+4)

        // Test update
        ft.update(3, 2); // Increment index 3 by 2
        System.out.println("After update, prefix sum up to index 3: " + ft.query(3)); // Output: 8
    }
}
