import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	
	static Scanner sc=new Scanner(System.in);

   
	
	
	private static void printInt(int a){
		System.out.print(a);
	}
	
	private static void printChar(char a){
		System.out.print(a);
	}
	
	private static void printString(String a){
		System.out.print(a);
	}
	
	private static void ln(){
		System.out.println();
	}
	
	private static void print2dArr(int[][]arr,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
			ln();
		}
	}
	private static void print1dArr(long[]arr,long r){
		for(int i=0;i<r;i++){
		
				System.out.print(arr[i]+" ");
			
		}
		ln();
	}
	

	public static void solution(){
		int n=sc.nextInt(),m=sc.nextInt();

        Map<Integer,Integer>mp;
        mp=new HashMap<>();
        for (Integer i=0;i<n;i++) {
            for (Integer j=0;j<m;j++) {
                Integer x=sc.nextInt();
                mp.put(x, i);
            }
        }

        List<Integer>ans;
        ans=new ArrayList<>();
        for (Integer i=0;i<n * m;i++) {
            if (i>=n) {
                if (!mp.get(i).equals(mp.get(i - n))) {
                    printInt(-1);
                    ln();
                    return;
                }
            } else {
                ans.add(mp.get(i) + 1);
            }
        }

        for (Integer x : ans) {
            printInt(x);
            printChar(' ');
        }
        ln();
		
	}
	
	public static void main(String[] args){
		
		Integer t=sc.nextInt();
		
		while(t-->0L)
		solution();
		
	}
}
