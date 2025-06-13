import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		String []in=br.readLine().split(" ");
		
		int []t=new int[4];
		for(int i=0;i<4;i++)
		t[i]=Integer.parseInt(in[i]);
		
		Arrays.sort(t);
		
		int a=t[0]+t[1]-t[3];
		int b=t[1]+t[2]-t[3];
		int c=t[0]+t[2]-t[3];
		System.out.println(a+" "+b+" "+c);
		
		
		
	}
	
	public static void main(String[]x) throws IOException {
		
	
		
		
		solution();
	}
}