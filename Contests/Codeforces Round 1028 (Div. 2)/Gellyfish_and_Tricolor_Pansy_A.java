import java.util.*;

public class Main{
	static Scanner sc=new Scanner(System.in);
	private static void solution(){
		long a,b,c,d;
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		d=sc.nextLong();
		
		int k=1;
		
					
		if (b <= a && b <= c) { 
		System.out.println("Gellyfish");
		} else if (a < d) { 
			System.out.println("Flower");
		} else if (d <= c) { 
			System.out.println("Gellyfish");
		} else { 
		System.out.println("Flower");
		}		
					
					
		
			
		
	}
	public static void main(String[]x){
		int t=sc.nextInt();
		while(t-->0)
		solution();
	}
}