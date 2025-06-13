import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		
		int n=Integer.parseInt(br.readLine());
		
		if(n%2==0){
			int s=(n-2)*2+1;
			System.out.println(s);
			int c=3;
			
			System.out.println(2+" "+1+" "+n);
			int fs=1;
			int fe=n-1;
			int ss=2;
			int se=n;
			while(c<=n){
				
				System.out.println(c+" "+fs+" "+fe);
				fe--;
				System.out.println(c+" "+ss+" "+se);
				ss++;
				c++;
			}
		}else{
			int s=(n-1)*2;
			System.out.println(s);
			int fs=1;
			int fe=n;
			int ss=2;
			int se=n;
			int c=2;
			while(c<=n){
			
				System.out.println(c+" "+fs+" "+fe);
				fe--;
				
				if(c<=n/2)
				ss=fe+2;
				else
				ss=n-fe+1;
				
				System.out.println(c+" "+ss+" "+se);
				// if(c%2==1)
				
				c++;
				
			}
			
			
		}
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}