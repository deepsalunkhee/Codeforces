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
	
	
	
	public static void solution(){
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] in = new int[n][m];
        Map<Integer, Boolean> colAd = new HashMap<>();

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                in[i][j] = sc.nextInt();
                colAd.put(in[i][j], false);
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int curcol = in[i][j];
               
                if (j + 1 < m && in[i][j + 1] == curcol) {
                    colAd.put(curcol, true);
                }
                
                if (i + 1 < n && in[i + 1][j] == curcol) {
                    colAd.put(curcol, true);
                }
            }
        }

        int sall = 0, maxs = 0;
        for (Map.Entry<Integer, Boolean> entry : colAd.entrySet()) {
            int steps = entry.getValue() ? 2 : 1;
            sall += steps;
            maxs = Math.max(maxs, steps);
        }

        int ans = Math.min(sall, sall - maxs);
        System.out.println(ans);
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
