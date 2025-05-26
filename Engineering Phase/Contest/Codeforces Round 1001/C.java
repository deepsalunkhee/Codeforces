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
	
	private static void print2dArr(char[][]arr,int r,int c){
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
	
public static void solution() {
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    int maxSum = 0;
    for (int num : a) {
        maxSum += num;
    }
    for (int k = 1; k <= a.length - 1; k++) {
        List<Integer> current = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            current.add(a[i]);
        }
        for (int step = 0; step < k; step++) {
            if (current.size() == 1) break;
            if (current.get(0) > current.get(current.size() - 1)) {
                Collections.reverse(current);
            }
            if (current.size() > 1) {
                int diff = current.size() - 1;
                current.add(diff, current.get(diff) - current.get(diff - 1));
                current.remove(diff);
            }
        }
        int sum = 0;
        for (int num : current) {
            sum += num;
        }
        if (sum > maxSum) {
            maxSum = sum;
        }
    }
    System.out.println(maxSum);
}
	
	public static void main(String[] args){
		
		long t=sc.nextLong();
		
		while(t-->0L)
		solution();
		
	}
}
