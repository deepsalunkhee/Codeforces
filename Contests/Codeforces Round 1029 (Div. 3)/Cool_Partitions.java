import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader input = new FastReader();
        int t = input.nextInt();
        
        while (t-- > 0) {
            solve(input);
        }
    }
    
    static void solve(FastReader input) throws IOException {
        int n = input.nextInt();
        
        Set<Integer> activeSet = new HashSet<>();
        Set<Integer> waitingSet = new HashSet<>();
        
        int zeroCounter = 0;
        int pendingElements = 0;
        int segmentCount = 0;
        
        for (int i = 0; i < n; i++) {
            int currentNum = input.nextInt();
            
            // Check if this element was needed from previous segment
            if (waitingSet.contains(currentNum)) {
                waitingSet.remove(currentNum);
                pendingElements--;
            }
            
            // Add to current segment if not already present
            if (!activeSet.contains(currentNum)) {
                activeSet.add(currentNum);
                if (currentNum == 0) {
                    zeroCounter++;
                }
            }
            
            // Check if current segment is complete
            if (pendingElements == 0 && zeroCounter == 0) {
                segmentCount++;
                
                // Transfer current segment to waiting list
                waitingSet.addAll(activeSet);
                pendingElements = activeSet.size();
                
                // Reset for next segment
                activeSet.clear();
                zeroCounter = 0;
            }
        }
        
        System.out.println(segmentCount);
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}