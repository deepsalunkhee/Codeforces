import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        while (t-- > 0) {
            long n = s.nextLong();
            int d = s.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            
            // Always include 1
            a.add(1);
            
            // Include 3 if n >= 3 or d is divisible by 3
            if (n >= 3 || d % 3 == 0) {
                a.add(3);
            }
            
            // Include 5 if d is 5
            if (d == 5) {
                a.add(5);
            }
            
            // Include 7 if n >= 3 or (n == 2 and d == 7)
            if (n >= 3 || (n == 2 && d == 7)) {
                a.add(7);
            }
            
            // Include 9 if special condition or n >= 6
            if (n >= 6) {
                a.add(9);
            } else {
                long f = 1;
                int i = 2;
                while (i <= n) {
                    f *= i;
                    i++;
                }
                if ((f * d) % 9 == 0) {
                    a.add(9);
                }
            }
            
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i));
                if (i < a.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}