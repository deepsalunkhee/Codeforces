import java.util.*;

public class Main{
	
	static Scanner sc = new Scanner(System.in);
	private static void solution(){
		int n=sc.nextInt();
		int []in=new int[n];
		int []ans=new int[n];
		
		
		
		for(int i=0;i<n;i++){
			in[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			ans[in[i]-1]=i+1;
		}
		
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+" ");
		}
	}
	
	public static void main(String x[]){
		solution();
	}
}