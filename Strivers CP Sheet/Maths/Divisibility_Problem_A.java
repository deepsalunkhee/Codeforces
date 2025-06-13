import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		String[]in=br.readLine().split(" ");
		int a=Integer.parseInt(in[0]);
		int b=Integer.parseInt(in[1]);
		int ans=0;
		if(a%b==0){
			ans=0;
		}else if(a<b){
			ans=b-a;
		}else{
			ans=b-(a%b);
		}		
		
		System.out.println(ans);
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}