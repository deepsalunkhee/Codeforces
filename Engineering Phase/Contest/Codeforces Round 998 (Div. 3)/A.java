import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	
	static Scanner sc=new Scanner(System.in);
	
	
	
	
	public static void solution(){
		
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a4=sc.nextInt();
		int a5=sc.nextInt();
		int[]in={a1,a2,0,a4,a5};
		int p1=a1+a2;
		int p2=a4-a2;
		int p3=a5-a4;
		
		int[]t=new int[3];
		t[0]=p1;
		t[1]=p2;
		t[2]=p3;
		int ans=0;
		
		for(int i=0;i<=2;i++){
			in[2]=t[i];
			int te=0;
			for(int j=0;j<3;j++){
				if(in[j]+in[j+1]==in[j+2]){
					te++;
				}
			}
			ans=Math.max(ans,te);
			te=0;
			
		}
		
		System.out.println(ans);
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
