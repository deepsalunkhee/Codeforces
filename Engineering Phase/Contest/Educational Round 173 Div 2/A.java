import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        long n = sc.nextLong();
        long ans = 1;

        while (n > 3) {
            ans *= 2;
            n /= 4;  // Use integer division directly
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        long t = sc.nextLong();

        while (t-- > 0) {
            solution();
        }
    }
}
