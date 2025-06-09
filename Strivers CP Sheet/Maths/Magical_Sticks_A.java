import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		
		int n=Integer.parseInt(br.readLine());
		if(n==1 ){
			System.out.println(1);
		}else if(n==3 ){
			System.out.println(2);
		}else{
			int ans=(int)Math.ceil(n/2.0);
			System.out.println(ans);
		}
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}