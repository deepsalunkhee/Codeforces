import java.util.*;
import java.io.*;

public class Main{
	static Scanner sc=new Scanner(System.in);
	
	private static void solution() throws IOException {
		int k,r;
		k=sc.nextInt();
		r=sc.nextInt();
		
		int c=1;
		while(true){
			if((k*c)%10==r ||(k*c)%10==0 ){
				break;
			}
			c++;
		}
		System.out.println(c);
	}
	
	public static void main(String[]x) throws IOException {
		
		
		solution();
	}
}