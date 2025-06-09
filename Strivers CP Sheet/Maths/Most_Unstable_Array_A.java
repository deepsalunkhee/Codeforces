import java.util.*;
import java.io.*;

public class Main{
	static Scanner sc= new Scanner(System.in);
	
	private static void solution() throws IOException {
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		if(n==1){
			System.out.println(0);
		}else if(n==2){
			System.out.println(m);
		}else{
			int ans=2*m;
			System.out.println(ans);
		}
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
	}
}