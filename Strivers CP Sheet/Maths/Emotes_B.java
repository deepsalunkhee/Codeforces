import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long max1 = Long.MIN_VALUE;
		long max2 = Long.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			long val = Long.parseLong(st.nextToken());
			if (val > max1) {
				max2 = max1;
				max1 = val;
			} else if (val > max2) {
				max2 = val;
			}
		}

		long d = m / (k + 1);
		long r = m % (k + 1);
		long ans = d * max1 * k + d * max2 + r * max1;

		System.out.println(ans);
	}
}
