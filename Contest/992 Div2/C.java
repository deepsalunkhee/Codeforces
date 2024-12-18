// Problem: C. Ordered Permutations
// Contest: Codeforces - Codeforces Round 992 (Div. 2)
// URL: https://codeforces.com/contest/2040/problem/C
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)

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
	
	private static void buildans(long i,long l,long r,long k,long[]ans){
		 if (l == r) {
	        ans[(int)l] = i;
	        return;
	    }
	    long sz = r - l - 1;
	    if (sz < 60 && (1L << sz) < k) {
	        ans[(int)r] = i;
	        buildans(i + 1, l, r - 1, k - (1L << sz), ans);
	    } else {
	        ans[(int)l] = i;
	        buildans(i + 1, l + 1, r, k, ans);
	    }
	}
	
	public static void solution(){
		
		long n,k;
		n=sc.nextLong();
		k=sc.nextLong();
		
	//1L is noting but long 1 
		if(n - 1 < 60 && (1L<<(n-1)) < k){
			printInt(-1);
			ln();
			return;
				
		}
		
		long[] ans=new long[(int)n];
		
		buildans(1,0,n-1,k,ans);
		print1dArr(ans,n);
		
		
		
	}
	
	public static void main(String[] args){
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
		
	}
}
