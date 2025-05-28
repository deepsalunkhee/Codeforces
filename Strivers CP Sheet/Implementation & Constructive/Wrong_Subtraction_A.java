 import java.util.*;
 import java.io.*;
 
 
 public class Main{
 	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 	
 	private static void solution() throws IOException{
 		String[] in=br.readLine().split(" ");
 		long n=Long.parseLong(in[0]);
 		long k=Long.parseLong(in[1]);
 		
 		for(long i=0;i<k;i++){
 			String t=Long.toString(n);
 			if(t.charAt(t.length()-1)=='0'){
 				n=n/10;
 			}else{
 				n=n-1;
 			}
 		}
 		System.out.println(n);
 	}
 	public static void main(String x[]) throws IOException{
 		solution();
 	}
 }