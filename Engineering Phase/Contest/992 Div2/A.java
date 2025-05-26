import java.util.*;
import java.lang.*;
import java.io.*;

class A{
	
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
	
	public static void solution(){
		
		int n,k;
		n=sc.nextInt();
		k=sc.nextInt();
		
		int[]in=new int[n];
		for(int i=0;i<n;i++){
			in[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j && Math.abs(in[i]-in[j])%k==0){
					System.out.println("Yes");
					System.out.println(i+1);
				}
			}
		}
		
		System.out.println("No");
		
		
	}
	
	public static void main(String[] args){
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
		
	}
}