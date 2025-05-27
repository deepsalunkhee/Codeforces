//here it is better to use scanner rather than bufferedreader
import java.util.*;

public class Main{
	
	static Scanner sc=new Scanner(System.in);
	private static void solution(){
		int n,k,l,c,d,p,nl,np;
		n=sc.nextInt();
		k=sc.nextInt();
		l=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		p=sc.nextInt();
		nl=sc.nextInt();
		np=sc.nextInt();
		
		int dc=(k*l)/nl;
		int sl=c*d;
		int gr=p/np;
		
		int ans=Math.min(dc,Math.min(sl,gr))/n;
		System.out.println(ans);
	}
	public static void main(String x[]){
		solution();
	}
}