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
		long n=sc.nextLong();
		long sd=0;
		long bd=0;
		
		String temp=sc.next();
		
		for(int i=0;i<n;i++){
			char t=temp.charAt(i);
			if(t=='-')
			sd++;
			else
			bd++;
		}
		
		if(sd%2==0){
			long t=sd/2;
			long ans=t*bd*t;
			System.out.println(ans);
		}else{
			long t=sd/2;
			long ans=(t+1)*bd*t;
			System.out.println(ans);
			
		}
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
