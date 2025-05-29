import java.util.*;

public class Main{
	static Scanner sc= new Scanner(System.in);
	private static void solution(){
		String x=sc.next();
		int slab=10;
		
		int till=(x.charAt(0)-'0')-1;
		int ans=slab*till;
		
		for(int i=1;i<=x.length();i++){
			ans+=i;
		}
		
		System.out.println(ans);
		
	}
	public static void main(String[] x){
		
		int t=sc.nextInt();
		while(t-->0)
		solution();
		
	}
}