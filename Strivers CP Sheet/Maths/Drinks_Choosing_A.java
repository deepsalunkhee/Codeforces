import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    private static void solution() throws IOException {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Integer freq[] = new Integer[m + 1];
        Arrays.fill(freq, 0);

        int set = (int) Math.ceil(n / 2.0);

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            freq[t]++;
        }

        
        Arrays.sort(freq, (a, b) -> b - a);
        //System.out.println(Arrays.toString(freq));


        int ans = 0;
        for (int i = 0; i < m && set > 0; i++) {
            int t = freq[i] / 2;
            
            set -= t;
            ans += t*2;
        }

       
        if (set > 0) {
            ans += set;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
