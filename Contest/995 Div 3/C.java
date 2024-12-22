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
		
		int n,m,k;
		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		int[]p=new int [m];
		for(int i=0;i<m;i++){
			p[i]=sc.nextInt();
		}
		
		Set<Integer>s=new HashSet<>();
		
		for(int i=0;i<k;i++){
			int t=sc.nextInt();
			s.add(t);
		}
		
		if(n==k){
			for(int i=0;i<m;i++){
				System.out.print(1);
				
			}
			ln();
			return;
		}
		
		if(n-1>k){
			for(int i=0;i<m;i++){
				System.out.print(0);
				
				
			}
			ln();
			return;
		}
		
		
		
		int[]ans=new int[m];
		
		for(int i=0;i<m;i++){
			if(s.contains(p[i])){
				ans[i]=0;
			}else{
				ans[i]=1;
			}
		}
		
		for(int i=0;i<m;i++){
			printInt(ans[i]);
		}
		ln();
		return;
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
