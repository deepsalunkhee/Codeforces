import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		
		String[]in=br.readLine().split(" ");
		int x=Integer.parseInt(in[0]);
		int y=Integer.parseInt(in[1]);
		int n=Integer.parseInt(in[2]);
		int r=n%x;
		int ans=0;
		if(r==y)
		ans=n;
		else if(r>y){
			ans=n-(r-y);
		}else{
			ans=n-(r)-x+y;
		}
		
		System.out.println(ans);
		
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}