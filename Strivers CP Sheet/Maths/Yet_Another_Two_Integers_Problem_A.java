import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		String[]in=br.readLine().split(" ");
		int a=Integer.parseInt(in[0]);
		int b=Integer.parseInt(in[1]);
		
		int n=Math.abs(a-b);
		
		int ans=0;
		int c=10;
		while(n>0){
			if(n==n%c){
				c--;
			}else{
				ans+=n/c;
				n=n%c;
				
			}
		
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}