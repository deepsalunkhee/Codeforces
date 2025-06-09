import java.util.*;
import java.io.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	private static void solution() throws IOException {
		
		
		int n=sc.nextInt();
		int []ans=new int [n];
		if((n/2)%2==1){
			System.out.println("NO");
			return;
			
		}else{
			int p=1;
			int i=0;
			while(p<=n+1){
				if(p==(n/2)+1){
					p++;
					continue;
				}
				
				if(p<=n/2){ans[i+(n/2)]=p++;
				
				ans[i]=p++;
				
			}else{
						
					ans[i]=p++;
					ans[i+(n/2)]=p++;
			
				};
					i++;
		}
		}
		
		System.out.println("YES");
		for(int i=0;i<n;i++)
		System.out.print(ans[i]+" ");
		System.out.println();
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=sc.nextInt();
		
		while(t-->0)
		solution();
	}
}