import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		int n=Integer.parseInt(br.readLine());
		int[]t={0,0,0};
		int ans=0;
		while(t[0]<n){
			t[0]=Math.min(t[1],t[2])*2+1;
			Arrays.sort(t);
			ans++;
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}