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
	
	public static void solution(){
		
		long n;
		n=sc.nextLong();
		//System.out.println(n);
		
		if(n==1){
		System.out.println(1);
		return;
		}
		if(n==2){
		System.out.println(2);
		return;	
		}
		long t=1;
		for(int i=2;i<n;i++){
			if(n<=t*2+2){
				System.out.println(i);
				return;
			}
			t=t*2+2;
		}
		
		
		
		
	}
	
	public static void main(String[] args){
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
		
	}
}