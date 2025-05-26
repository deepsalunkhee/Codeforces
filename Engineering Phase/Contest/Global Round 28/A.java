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
		
		if(n%33==0) {
			printString("YES");
			ln();
			return;
		}
		
		String s=Long.toString(n);
		while(s.contains("33")){
			s=s.replaceFirst("33","");
		}
		
		n=s.isEmpty()?0:Long.parseLong(s);
		
		if(n==0 || n%33==0){
			printString("YES");
			ln();
			return;
		}else{
			printString("NO");
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
