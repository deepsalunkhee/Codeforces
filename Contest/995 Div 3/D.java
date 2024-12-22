import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	
	static Scanner sc=new Scanner(System.in);
	
	
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
	private static void print1dArr(long[]arr,long r){
		for(int i=0;i<r;i++){
		
				System.out.print(arr[i]+" ");
			
		}
		ln();
	}
	
	private static int lb(long[] a, int l, int h, long k) {
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l;
    }

    private static int ub(long[] a, int l, int h, long k) {
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] > k) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h;
    }
	
	
	
	public static void solution(){
		
		 int n = sc.nextInt();
            long x = sc.nextLong(), y = sc.nextLong();
            long[] a = new long[n];
            long s = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                s += a[i];
            }

            Arrays.sort(a);

            long l = s - y, r = s - x, c = 0;

            for (int i = 0; i < n; i++) {
                int lo = i + 1, hi = n - 1;

                int lb = lb(a, lo, hi, l - a[i]);
                int ub = ub(a, lo, hi, r - a[i]);

                c += (ub - lb + 1);
            }

            System.out.println(c);
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
