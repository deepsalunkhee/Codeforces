import java.util.*;
import java.io.*;

public class Main{
	
	static Scanner sc=new Scanner(System.in);
	
	private static void solution() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int x=Math.min(a,b);
		int y=Math.max(a,b);
		
		int s=Math.max((2*x),y);
		int ans=s*s;
		System.out.println(ans);
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
	}
}