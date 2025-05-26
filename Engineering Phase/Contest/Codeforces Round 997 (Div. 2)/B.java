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
	
	private static void print2dArr(int[][]arr,int r,int c){
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
		
		int n=sc.nextInt();
		int[]shift=new int[n+1];
		for(int i=0;i<n;i++){
				int s=0;
			char[] ro=sc.next().toCharArray();
			for(int j=0;j<n;j++){
				
				int t=ro[j];
				if(i>j && t=='1'){
					s++;
				}
				
				if(i<j && t=='1'){
					s--;
				}
			}
			shift[i+1]=s;
		}
		
		//print2dArr(g,n,n);
		
		int[]ans=new int[n];
		
		for(int i=1;i<=n;i++){
			int ol=n-i;
			int nl=ol+shift[i];
			//System.out.println(nl);
			ans[nl]=i;
		}
		
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+" ");
		}
		ln();
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
