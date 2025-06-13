import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		String[]in=br.readLine().split(" ");
		int n=Integer.parseInt(in[0]);
		int k=Integer.parseInt(in[1]);
		
		StringBuilder ans=new StringBuilder("");
		if(k!=0)
		ans.append(1);
		int t=n-k-1;
		while(t-->0){
			ans.append("0");
		}
		int t2=k-1;
		while(t2-->0){
			ans.append("1");
		}
		
		if(n!=k)
		ans.append("0");
		
		String an=ans.toString();
		
		System.out.println(an);
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}