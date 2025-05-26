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
		
		HashMap<Integer,Integer>m=new HashMap<>();
		
		for(int i=1;i<=1000;i++){
			m.put(i,0);
		}
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			int t=sc.nextInt();
			m.put(t,m.get(t)+1);
		}
		
		int req=0;
		
		for(int i=1000;i>=1;i--){
			
			int curr=m.get(i);
			
			if(curr==req){
				req=0;
				
				
			}else if(curr>req){
				
				int rem=curr-req;
				if(rem%2==0){
					req=0;
				}else{
					req=3;
				}
				
			}else{
				int rem=req-curr;
				req=rem+2;
			}
				
			
			
			
		}
		
		if(req==0)
		System.out.println("Yes");
		else
		System.out.println("No");
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
