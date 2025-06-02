import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		int n=Integer.parseInt(br.readLine());
		if(n%2==0)
		System.out.println("Mahmoud");
		else
		System.out.println("Ehab");
		
	}
	
	public static void main(String[]x) throws IOException {
		
		
		solution();
	}
}