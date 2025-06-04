import java.util.*;

public class Main{
	
	private static Scanner sc= new Scanner(System.in);
	private static void solution(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int r=Math.max(a,b);
		int c=Math.min(a,b);
		int ans=0;
		if(c%2==0){
			ans=r*(c/2);
		}else{
			ans=r*(c/2)+(int)Math.ceil(r/2.0);
		}
		
		System.out.println(ans);
	}
	public static void main(String[]x){
		int t=sc.nextInt();
		while(t-->0)
		solution();
	}
}