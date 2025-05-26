import java.util.*;
import java.io.*;

public class Main {
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
        long x = sc.nextLong();
        long k = sc.nextLong();
        String s = sc.next();

        long ans = 0;

        
        boolean phase1Hit = false;
        for (int i = 0; i < n && k > 0; i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                x--;
            } else {
                x++;
            }
            k--;
            if (x == 0) {
                ans++;
                phase1Hit = true;
                break;
            }
        }

        if (phase1Hit && k > 0) {
           
            int m = 0;
            int currentPos = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'L') {
                    currentPos--;
                } else {
                    currentPos++;
                }
                if (currentPos == 0 && i >= 0) { 
                    m = i + 1; 
                    break;
                }
            }

            if (m > 0) {
                long fullCycles = k / m;
                ans += fullCycles;
                long remaining = k % m;

                currentPos = 0;
                boolean hit = false;
                for (int i = 0; i < remaining; i++) {
                    char c = s.charAt(i % n);
                    if (c == 'L') {
                        currentPos--;
                    } else {
                        currentPos++;
                    }
                    if (currentPos == 0 && i < remaining - 1) { 
                        hit = true;
                        break;
                    }
                }
                if (hit) {
                    ans++;
                }
            } else {
               
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solution();
        }
    }
}