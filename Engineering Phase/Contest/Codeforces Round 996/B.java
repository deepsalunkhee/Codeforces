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
		long[]a=new long[n];
		long[]b=new long[n];
		
		long minextra=Integer.MAX_VALUE;
		long extraneed=0;
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		
		int ng=0;
		
		for(int i=0;i<n;i++){
			b[i]=sc.nextLong();
			
			if(a[i]-b[i]>=0){
				minextra=Math.min(minextra,a[i]-b[i]);
			}else{
				extraneed+=b[i]-a[i];
				ng++;
				
				
			}
		}
		
		if(ng>=2){
		System.out.println("NO");
		return;
		}
		
		if(minextra>=extraneed)
		System.out.println("YES");
		else
		System.out.println("NO");
		
		return;
		
		  
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
