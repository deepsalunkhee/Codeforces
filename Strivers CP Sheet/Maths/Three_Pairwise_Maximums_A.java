import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		
		String[]temp=br.readLine().split(" ");
		int[]in=new int[3];
		
		in[0]=Integer.parseInt(temp[0]);
		in[1]=Integer.parseInt(temp[1]);
		in[2]=Integer.parseInt(temp[2]);
		
		
		
		if(in[0]!=in[1] && in[1]!=in[2] && in[0]!=in[2]){
			System.out.println("NO");
			return;
		}else{
			int[]t=in;
			Arrays.sort(t);
			if(t[0]==t[1]&& t[1]!=t[2] ){
				System.out.println("NO");
				return;
			}else{
				System.out.println("YES");
				System.out.println(t[0]+" "+1+" "+t[2]);
				return;
			}
			
		}

		
		
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}