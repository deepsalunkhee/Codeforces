import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	
	static Scanner sc= new Scanner(System.in);
	
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
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Integer[] in=new Integer[a];
		
		for(int i=0;i<a;i++)in[i]=sc.nextInt();
		
		Arrays.sort(in,Comparator.reverseOrder());
		
		int su=0;
		
		for(Integer x:in){
			su+=x;
			if(su==b){
				printInt(0);
				ln();
				return;
			}else if(su>b){
				su-=x;
				printInt(b-su);
				ln();
				return;
			}
		}
		
		printInt(b-su);
		ln();
		return;
		
		
		
	}
	
	public static void main(String[] args){
		
		int t=sc.nextInt();
		
		
		
		while(t!=0){
		solution();
		t--;	
		}
		
		
	}
}