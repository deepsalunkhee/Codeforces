import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		int n=Integer.parseInt(br.readLine());
	    int c=2*n-1;
	    System.out.println(c);
	     System.out.println( 1 + " " + 1 +" " + n );
	    for (int i = 2; i <= n; i++) {
	    	int fe=i-1;
	       System.out.println( i + " " + 1 + " " + fe );
	      System.out.println(i + " " + i + " " + n );
	    }
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}