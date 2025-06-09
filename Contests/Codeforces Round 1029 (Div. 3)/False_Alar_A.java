import java.util.*;
import java.io.*;

public class Main{
	static Scanner sc= new Scanner(System.in);
	
	private static void solution() throws IOException {
		int n=sc.nextInt();
		int s=sc.nextInt();
		int[]d=new int[n];
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
			
		}
		
		int np=0;
		
		for(int i=0;i<n;i++){
			if(d[i]==1){
				np=i+s;
				break;
			}
		}
		
		if(np>=n){
			System.out.println("YES");
			return;
		}else{
			for(int i=np;i<n;i++){
				if(d[i]==1){
					System.out.println("NO");
					return;
				}
			}
		}
		
		System.out.println("YES");
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
	}
}