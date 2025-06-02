import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		String[]in=br.readLine().split(" ");
		
		float n=Float.parseFloat(in[0]);
		float x=Float.parseFloat(in[1]);
		
		if(n<=2.0){
			System.out.println(1);
			return;
		}
		
		int ans=(int)Math.ceil((n-2)/x)+1;
		System.out.println(ans);
		return;
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}