import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static long calculateSum(int[] p) {
    int n = p.length;
    long sum = 0;

    // Calculate contribution of each element as the minimum
    for (int i = 0; i < n; i++) {
        // Determine the left boundary where p[i] is the minimum
        int left = i;
        while (left > 0 && p[left - 1] >= p[i]) {
            left--;
        }

        // Determine the right boundary where p[i] is the minimum
        int right = i;
        while (right < n - 1 && p[right + 1] >= p[i]) {
            right++;
        }

        // Calculate the number of subarrays where p[i] is the minimum
        long count = (long) (i - left + 1) * (right - i + 1);

        // Add contribution to the sum
        sum += count * p[i];
    }

    return sum;
}


    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE; // Use BigInteger to handle large results
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static boolean nextPermutation(int[] nums,long msum) {
        int n = nums.length;

        // Step 1: Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If no such element is found, the array is in descending order
        if (i < 0) {
            reverse(nums, 0, n - 1);
            return false; // No next permutation
        }

        // Step 2: Find the smallest element larger than nums[i] from the end
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }

        // Step 3: Swap nums[i] and nums[j]
        swap(nums, i, j);

        // Step 4: Reverse the elements to the right of i
        reverse(nums, i + 1, n - 1);
        
        long sum=calculateSum(nums);
        //System.out.println(sum);
        
        


        return sum==msum; // Found next permutation
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void printInt(int a) {
        System.out.print(a);
    }

    private static void printChar(char a) {
        System.out.print(a);
    }

    private static void printString(String a) {
        System.out.print(a);
    }

    private static void ln() {
        System.out.println();
    }

    private static void print2dArr(char[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            ln();
        }
    }

    private static void print1dArr(int[] arr, long r) {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        ln();
    }

    public static void solution() {

        long n, k;
        n = sc.nextLong();
        k = sc.nextLong();
        long msum=0;
        
        
       

        BigInteger K = BigInteger.valueOf(k);
        BigInteger f = factorial((int) n);

        if (K.compareTo(f) > 0) {
            System.out.println(-1);
            return;
        }

        int[] in = new int[(int) n];

        for (int i = 1; i <= n; i++) {
            in[i - 1] = i;
        }
		 msum=calculateSum(in);
		 //System.out.println("max");
		 //System.out.println(msum);
        if (k == 1) {
            print1dArr(in, n);
        } else {
        	int c=1;
            for (int i = 1; BigInteger.valueOf(i).compareTo(f) < 0; i++) {
    if(nextPermutation(in,msum))
        c++;

    if(c==k){
        print1dArr(in, n);
        return;
    }
}
            System.out.println(-1);
            return;
           
        }
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0)
            solution();
    }
}
