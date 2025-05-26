import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    // Binary search to find the smallest x >= lowerBound such that x * pow >= l2
    private static long findLowerBound(long lowerBound, long upperBound, long pow, long l2) {
        long left = lowerBound;
        long right = upperBound;
        long result = upperBound + 1; // Default if no valid x is found

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * pow >= l2) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // Binary search to find the largest x <= upperBound such that x * pow <= r2
    private static long findUpperBound(long lowerBound, long upperBound, long pow, long r2) {
        long left = lowerBound;
        long right = upperBound;
        long result = lowerBound - 1; // Default if no valid x is found

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * pow <= r2) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void solution() {
        long k = sc.nextLong();
        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();

        long ans = 0;

        // Case n=0: y = x
        long start = Math.max(l1, l2);
        long end = Math.min(r1, r2);
        if (start <= end) {
            ans += end - start + 1;
        }

        // Case n >= 1
        long pow = k;
        while (true) {
            // Find the valid x range for current pow
            long lowerX = findLowerBound(l1, r1, pow, l2);
            long upperX = findUpperBound(l1, r1, pow, r2);

            if (lowerX <= upperX) {
                ans += upperX - lowerX + 1;
            }

            // Check if next power would exceed r2 / l1 or cause overflow
            if (pow > r2 / l1 || pow > Long.MAX_VALUE / k) {
                break;
            }
            pow *= k;
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