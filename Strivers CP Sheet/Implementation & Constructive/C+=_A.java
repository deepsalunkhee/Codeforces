import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	private static void solution(){
		int a,b,n;
		a=sc.nextInt();
		b=sc.nextInt();
		n=sc.nextInt();
		
		int A=Math.max(a,b);
		int B=Math.min(a,b);
		
		int ans1=0;
		int ans2=0;
		while(A<=n && B<=n){
			if(ans1%2==0){
				A+=B;
			}else{
				B+=A;
			}
			
			ans1++;
		}
		 A=Math.max(a,b);
		 B=Math.min(a,b);
		while(A<=n && B<=n){
			if(ans2%2==1){
				A+=B;
			}else{
				B+=A;
			}
			
			ans2++;
		}
		
		 A=Math.max(a,b);
		 B=Math.min(a,b);
		
		
		System.out.println(Math.min(ans1,ans2));
	}
	public static void main(String[]x){
		int t=sc.nextInt();
		
		while(t-->0){
			solution();
		}
	}
}