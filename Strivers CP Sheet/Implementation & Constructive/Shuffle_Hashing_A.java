import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    private static void solution() {
        String p = sc.next();
        String h = sc.next();

        int[] freqP = new int[26];
        for (char c : p.toCharArray()) {
            freqP[c - 'a']++;
        }

        int pLen = p.length();
        int hLen = h.length();

        for (int i = 0; i <= hLen - pLen; i++) {
            String sub = h.substring(i, i + pLen);
            int[] freqSub = new int[26];
            for (char c : sub.toCharArray()) {
                freqSub[c - 'a']++;
            }
            if (Arrays.equals(freqP, freqSub)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0)
            solution();
    }
}
