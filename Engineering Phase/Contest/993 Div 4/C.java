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
		
		long m=sc.nextLong();
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		
		long ans=0;
		
		long m2=m;
		
		if(a>=m){
			ans+=m;
			m=0;
		}else{
			ans+=a;
			m=m-a;
		}
		
		if(b>=m2){
			ans+=m2;
			m2=0;
		}else{
			ans+=b;
			m2=m2-b;
		}
		
		m+=m2;
		
		ans+=Math.min(m,c);
		System.out.println(ans);
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
