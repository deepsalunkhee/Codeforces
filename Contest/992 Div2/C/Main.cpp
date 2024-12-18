import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;




public class Main{
	
	static Scanner sc=new Scanner(System.in);
	
	    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE; // Use BigInteger to handle large results
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

	  public static boolean nextPermutation(int[] nums) {
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

        return true; // Found next permutation
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
	
	private static void print2dArr(char[][]arr,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			ln();
		}
	}
	private static void print1dArr(int[]arr,int r){
		for(int i=0;i<r;i++){
			
				System.out.print(arr[i][j]+" ");
			
		}
		
			ln();
	}
	
	public static void solution(){
		
		long n,k;
		n=sc.nextLong();
		n=sc.nextLong();
		//System.out.println(n);
		
		BigInteger K=BigInteger.valueOf(k);
		if(K>factorial(n)){
			System.out.println(-1);
			return;
		}
		
		int in=new int[n];
		
		for(int i=1;i<=n;i++){
			in[i-1]=i;
		}
		
		if(k==1)
		print1dArr(in,n);
		else{
			for(int i=1;i<k;i++){
				nextPermutation(in);
			}
			print1dArr(in,n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
		
	}
}