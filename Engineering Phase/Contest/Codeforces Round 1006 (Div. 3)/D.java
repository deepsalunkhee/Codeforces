import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int val, idx;
        
        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            if (n == 1) {
                System.out.println("1 1");
                continue;
            }
            
            int bestL = 1, bestR = 1;
            int minInversions = Integer.MAX_VALUE;
            
            // For each possible shift, calculate the resulting inversions more efficiently
            for (int l = 1; l <= n; l++) {
                for (int r = l; r <= n; r++) {
                    // Array after shifting [l,r]
                    int[] shifted = new int[n];
                    for (int i = 0; i < n; i++) {
                        if (i < l-1 || i > r-1) {
                            shifted[i] = arr[i];
                        } else if (i == r-1) {
                            shifted[i] = arr[l-1];
                        } else {
                            shifted[i] = arr[i+1];
                        }
                    }
                    
                    // Count inversions using merge sort technique
                    int inversions = countInversionsMergeSort(shifted);
                    
                    if (inversions < minInversions) {
                        minInversions = inversions;
                        bestL = l;
                        bestR = r;
                    }
                }
            }
            
            System.out.println(bestL + " " + bestR);
        }
        sc.close();
    }
    
    private static int countInversionsMergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }
    
    private static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int inversions = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            
            // Count inversions in left half
            inversions += mergeSort(arr, temp, left, mid);
            
            // Count inversions in right half
            inversions += mergeSort(arr, temp, mid + 1, right);
            
            // Count inversions during merge
            inversions += merge(arr, temp, left, mid + 1, right);
        }
        return inversions;
    }
    
    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        int inversions = 0;
        
        while (i <= mid - 1 && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // If arr[i] > arr[j], then all elements from i to mid-1 are greater than arr[j]
                temp[k++] = arr[j++];
                inversions += (mid - i);
            }
        }
        
        // Copy remaining elements
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }
        
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        // Copy temp back to original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        
        return inversions;
    }
}