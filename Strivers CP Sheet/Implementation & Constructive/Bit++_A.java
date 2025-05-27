import java.util.*;
import java.io.*;

public class Main{
	
	static Scanner sc=new Scanner(System.in);
	
	
	public static void solution(){
		
		int n=sc.nextInt();
		int ans=0;
		for(int i=0;i<n;i++){
			String in=sc.next();
			if(in.charAt(1)=='+'){
				ans++;
			}else{
				ans--;
			}
		}
		
		System.out.println(ans);
		
	}
	
	public static void main(String[] args){
			
		solution();
		
	}
}
