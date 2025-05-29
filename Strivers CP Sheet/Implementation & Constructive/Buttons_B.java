import java.util.*;

public class Main{
	static Scanner sc= new Scanner(System.in);
	
	private static void solution(){
		int n=sc.nextInt();
		int t=n-1;
		long ans=0;
		for(int i=1;i<n;i++){
			ans+=t*i;
			t--;
		}
		
		ans+=n;
		
		System.out.println(ans);
	}
	public static void main(String[]x){
		solution();
	}
}