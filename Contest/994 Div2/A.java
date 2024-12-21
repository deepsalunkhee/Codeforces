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
		int c0=0;
		boolean f0=false;
		int maxcn0=1;
	
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]==0){
			c0++;
			f0=true;
			}
		}
		
		int b=0;
		
		for(int i=1;i<n;i++){
			
			if(b==2) break;
			if(a[i]!=0 && a[i-1]!=0){
				maxcn0++;
			}
			
			if((a[i]==0 && a[i-1]!=0) ||(a[i]!=0 && a[i-1]==0) ){
				b++;
			}
		}			
		
		if(c0==n){
			printInt(0);
			ln();
			return;	
		}else if(maxcn0+c0==n){
			printInt(1);
			ln();
			return;
		}else{
			printInt(2);
			ln();
			return;
		}
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
