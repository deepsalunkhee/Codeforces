	import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		int n=Integer.parseInt(br.readLine());;
		int[] ans=new int[n];
		int s=0;
		int e=n-1;
		int c=1;
		while(s<e){
			ans[s]=c++;
			ans[e]=c++;
			s++;
			e--;
		}
		
		if(s==e)
		ans[s]=c;
		
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}