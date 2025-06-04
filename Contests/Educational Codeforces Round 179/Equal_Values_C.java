import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		
		int n=Integer.parseInt(br.readLine());
		String[]in=br.readLine().split(" ");
		long[]a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=Long.parseLong(in[i]);
		}
		
		int s=0;int e=0;
		
		long ans=Long.MAX_VALUE;
		
		for( e=1;e<n;e++){
			if(a[e-1]!=a[e]){
				
				ans=Math.min(ans,a[s]*s+a[s]*(n-e));
				
				s=e;
			}else{
				continue;
			}
		}
		
		ans=Math.min(ans,a[s]*s+a[s]*(n-e));
		
		System.out.println(ans);
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}