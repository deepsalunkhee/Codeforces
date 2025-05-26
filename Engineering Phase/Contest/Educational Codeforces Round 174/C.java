import java.util.*;

public class Main {
    static final int MOD = 998244353;
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
	
    
   
    public static long power(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        int[] in = new int[n];
        
      
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextInt();
        }

       
        int[] prefixTwos = new int[n];
        prefixTwos[0] = (in[0] == 2) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            prefixTwos[i] = prefixTwos[i - 1] + (in[i] == 2 ? 1 : 0);
        }

        long ans = 0;
        
       
        for (int i = 0; i < n; i++) {
            if (in[i] == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (in[j] == 3) {
                        
                        int countTwos = prefixTwos[j - 1] - (i > 0 ? prefixTwos[i - 1] : 0);
                       
                        ans = (ans + power(2, countTwos, MOD) - 1 + MOD) % MOD;
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solution(sc);
        }
    }
}
