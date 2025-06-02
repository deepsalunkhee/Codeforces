
```Java
public class LCMCalculator {

    // Function to compute GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute LCM
    private static int lcm(int x, int y) {
        return Math.abs(x * y) / gcd(x, y);  // abs handles negative input
    }

    public static void main(String[] args) {
        int x = 12, y = 18;
        System.out.println("LCM of " + x + " and " + y + " is: " + lcm(x, y));
    }
}

```