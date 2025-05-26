import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    static boolean sol(int n, String s) {
        int[] p = new int[n];
        int[] a = new int[n];
        Arrays.fill(p, Integer.MAX_VALUE);
        Arrays.fill(a, Integer.MAX_VALUE);
        
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'p') {
                p[i] = i + 1;
            }
            if(s.charAt(i) == 's') {
                a[i] = n - i;
            }
        }
        
        for(int i = 1; i < n; i++) {
            a[i] = Math.min(a[i], a[i-1]);
        }
        
        for(int i = n-2; i >= 0; i--) {
            p[i] = Math.min(p[i], p[i+1]);
        }
        
        int[] t = new int[n];
        for(int i = 0; i < n; i++) {
            t[i] = Math.min(a[i], p[i]);
        }
        
        Arrays.sort(t);
        
        for(int i = 0; i < n; i++) {
            if(t[i] < i + 1) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(sol(n,s) ? "YES" : "NO");
        }
    }
}