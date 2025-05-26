import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(reader.readLine());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            long k = Long.parseLong(st.nextToken());
            long l1 = Long.parseLong(st.nextToken());
            long r1 = Long.parseLong(st.nextToken());
            long l2 = Long.parseLong(st.nextToken());
            long r2 = Long.parseLong(st.nextToken());
            
            long count = 0;
            
            for (long kn = 1; kn <= r2; kn *= k) {
                if (kn > 1e9) break; // Stop if kn exceeds 10^9
                
                long ceilStart = (l2 + kn - 1) / kn; // Equivalent to ceil(l2 / kn)
                long floorEnd = r2 / kn; // Equivalent to floor(r2 / kn)
                
                long start = Math.max(l1, ceilStart);
                long end = Math.min(r1, floorEnd);
                
                if (start <= end) {
                    count += (end - start + 1); // Add the size of the interval
                }
            }
            
            output.append(count).append("\n");
        }
        
        System.out.print(output);
    }
}
