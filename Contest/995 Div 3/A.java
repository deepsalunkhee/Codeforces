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
		
		int n=sc.nextInt();
		int[]a=new int[n];
		int[]b=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
			
		}
		
		int ans=0;
		
		for(int i=0;i<n-1;i++){
			if(a[i]>b[i+1])
			ans+=a[i]-b[i+1];
		}
		
		ans+=a[n-1];
		
		printInt(ans);
		ln();
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}