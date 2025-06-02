import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
    
	private static void solution() throws IOException {
			String []in=br.readLine().split(" ");
			int l=Integer.parseInt(in[0]);
			int r=Integer.parseInt(in[1]);
			
			if(l*2<=r){
				System.out.println(l+" "+2*l);
			}else{
				System.out.println(-1+" "+-1);
			}
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}