import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

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

    private static void print1dArr(long[] arr, long r) {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        ln();
    }

    public static void solution() {
        long n = sc.nextLong();
        long x = sc.nextLong();

        boolean obtained = false;
        List<Long> pans = new ArrayList<>();

        long c = 0;
        long va = 0;
        for (long i = 0; i < n; i++) {
            c = c | i;
            if (c <= x) {
                if (c == x){
                	obtained = true;
                }
                    

                pans.add((long) i);
                
                continue;
            }
            break;
        }

        int ns = pans.size();
        if (!obtained && ns==n) {
            pans.set(ns - 1, x); 
        }else{
        	 pans.add(x); 
        }
        
        ns = pans.size();

        long[] ans = new long[(int) n];
        int it = 0;
        while (it < n) {
            ans[it] = pans.get(it % ns);
            it++;
        }
		//System.out.println(ns);
		
		for(long i=n-1;i>=0;i--){
			long t=x|ans[(int)i];
			if(t>x){
				ans[(int)i]=0;
			}
		}
        print1dArr(ans, n);
    }

    public static void main(String[] args) {
        long t = sc.nextLong();
        while (t-- > 0L)
            solution();
    }
}
