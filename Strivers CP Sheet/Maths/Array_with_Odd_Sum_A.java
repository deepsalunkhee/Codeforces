import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static void solution() throws IOException {
		int l=Integer.parseInt(br.readLine());
		String[]in=br.readLine().split(" ");
		
		
		if(l%2==0){
			boolean e=false;
			boolean o=false;
			for(int i=0;i<l;i++){
				
				if((Integer.parseInt(in[i]))%2==1){
					o=true;
				}else{
					e=true;
				}
				if(o && e){
					System.out.println("YES");
					return;
				}
			}
		}else{
			boolean e=false;
			boolean o=false;
			for(int i=0;i<l;i++){
				
				if((Integer.parseInt(in[i]))%2==1){
					o=true;
				}else{
					e=true;
				}
				if(o && e){
					System.out.println("YES");
					return;
				}
			}
			
			if(o){
					System.out.println("YES");
					return;
				}
			
		}
		
		System.out.println("NO");
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}