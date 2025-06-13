import java.util.*;
import java.io.*;

public class Main{
	static Scanner sc=new Scanner(System.in);
	
	private static void solution() throws IOException {
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int p=n*m;
		int ans=0;
		if(p%2==0){
			ans=p/2;
		}else{
			ans=(p-1)/2;
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[]x) throws IOException {
		
		
		solution();
	}
}