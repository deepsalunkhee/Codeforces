import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		
		
		int n=Integer.parseInt(br.readLine());
		
		int ans=0;
		int c=5;
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
		
		
		solution();
	}
}