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
		
		long n,a,b,c;
		long nog;
		
		n=sc.nextLong();
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		nog=n;
		
		n=Math.max(0,n-a);
		n=Math.max(0,n-b);
		n=Math.max(0,n-c);
		
		long f=n/(a+b+c);
		
		long ans=f*3;
		long com=f*(a+b+c);
		
		n=Math.max(0,n-(com));
		
		while(true){
			
			if(com>=nog){
				break;
			}
			
			
			com+=a;
			ans++;
			if(com>=nog){
				break;
			}
			
			com+=b;
			ans++;
			if(com>=nog){
				break;
			}
			
			com+=c;
			ans++;
			if(com>=nog){
				break;
			}
		}
		
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
