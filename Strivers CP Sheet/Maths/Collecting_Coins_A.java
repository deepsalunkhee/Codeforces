import java.util.*;

public class Main{
	
	static Scanner sc= new Scanner(System.in);
	
	private static void solution(){
		int a,b,c,n;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		n=sc.nextInt();
		
		if((a+b+c+n)%3!=0 || Math.max(a,Math.max(b,c))>(a+b+c+n)/3)
		System.out.println("NO");
		else
		System.out.println("YES");
	}
	public static void main(String[]x){
		int t=sc.nextInt();
		while(t-->0)
		solution();
	}
}