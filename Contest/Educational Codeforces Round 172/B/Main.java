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
		
		
		Integer[] in=new Integer[a];
		Set<Integer>s=new HashSet<>();
		
		HashMap<Integer,Integer> m=new HashMap<>();
		
		for(int i=0;i<a;i++){
			in[i]=sc.nextInt();
			m.put(in[i],m.getOrDefault(in[i],0)+1);
			s.add(in[i]);
			}
			
			int ans=0;
			int c=0;
		
		for(int i=0;i<a;i++){
			if(m.get(in[i])==1)
			c++;
		}
		// printString("j");
		// printInt(c);
		// printString("j");
		// printInt(s.size());
		// ln();
		
		int si=(int)Math.ceil(c/2.0);
		
		
		
		ans+=si*2;
		
		ans+=s.size()-c;
		
		
		
		
		printInt(ans);
		ln();
		
		
		
		
	}
	
	public static void main(String[] args){
		
		int t=sc.nextInt();
		
		
		
		while(t!=0){
		solution();
		t--;	
		}
		
		
	}
}