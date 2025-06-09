import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		int n=Integer.parseInt(br.readLine());
		String in[]=br.readLine().split(" ");
		int[]a=new int[n];
		
		int np=0;
		int e=0;
		int o=0;
		
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(in[i]);
			if(a[i]%2!=i%2){
				np++;
				if(a[i]%2==0){
					e++;
				}else{
					o++;
				}	
			}
		}
		
		if(np%2==0 && e==o){
			System.out.println(np/2);
		}else{
			System.out.println(-1);
		}
		
		
		
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}