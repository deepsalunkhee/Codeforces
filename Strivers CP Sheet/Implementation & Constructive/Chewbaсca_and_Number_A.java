import java.util.*;


public class Main{
	static Scanner sc = new Scanner(System.in);
	private static void solution(){
		
		
		StringBuilder ans=new StringBuilder("");
		
		String x=sc.next();
		long n=x.length();
		
		if(x.charAt(0)=='9')
		ans.append ('9');
		else
		ans.append(Math.min('9'-x.charAt(0),x.charAt(0)-'0'));
		
		for(int i=1;i<n;i++){
			int ap=Math.min('9'-x.charAt(i),x.charAt(i)-'0');
			ans.append(ap);	
			}
		
		System.out.println(ans.toString());
		
	}
	public static void main(String arg[]){
		
		solution();
		
	}
}