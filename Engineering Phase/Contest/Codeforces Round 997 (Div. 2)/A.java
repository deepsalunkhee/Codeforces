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
		int m=sc.nextInt();
		
		int ans=m*4;
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		for(int i=0;i<n-1;i++){
			ans+=m*4;
			int rm=sc.nextInt();
			int cm=sc.nextInt();
			
			int nr=r+rm;
			int nc=c+cm;
			
			int dif=(((r+m)-nr)+((c+m)-nc))*2;
			
			r=nr;
			c=nc;
			ans-=dif;
			//System.out.println(nr+" "+nc+" "+dif+" "+ans);
			
		}
		
		System.out.println(ans);
		return;
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
