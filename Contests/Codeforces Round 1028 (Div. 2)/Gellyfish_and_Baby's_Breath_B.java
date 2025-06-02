import java.io.*;
import java.util.*;

public class Main {
    static final int MOD = 998244353;
    static final int MAX_N = 100000;
    static long[] pow2 = new long[MAX_N + 1];

    static {
        pow2[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] p = new int[n];
            int[] q = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                q[i] = Integer.parseInt(st.nextToken());
            }

            PriorityQueue<int[]> heapP = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            Set<Integer> setP = new HashSet<>();
            PriorityQueue<int[]> heapQ = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            Set<Integer> setQ = new HashSet<>();
            List<Long> resList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (heapP.size() < 30) {
                    heapP.add(new int[]{p[i], i});
                    setP.add(i);
                } else {
                    if (p[i] > heapP.peek()[0]) {
                        int[] removed = heapP.poll();
                        setP.remove(removed[1]);
                        heapP.add(new int[]{p[i], i});
                        setP.add(i);
                    }
                }

                if (heapQ.size() < 30) {
                    heapQ.add(new int[]{q[i], i});
                    setQ.add(i);
                } else {
                    if (q[i] > heapQ.peek()[0]) {
                        int[] removed = heapQ.poll();
                        setQ.remove(removed[1]);
                        heapQ.add(new int[]{q[i], i});
                        setQ.add(i);
                    }
                }

                Set<Integer> candidateJ = new HashSet<>(setP);
                for (int k : setQ) {
                    int j = i - k;
                    candidateJ.add(j);
                }

                int bestM = -1;
                int bestm = -1;
                for (int j : candidateJ) {
                    if (j < 0 || j > i) continue;
                    int k = i - j;
                    if (k < 0 || k >= n) continue;
                    int a = p[j];
                    int b = q[k];
                    int M_here = Math.max(a, b);
                    int m_here = Math.min(a, b);
                    if (bestM == -1) {
                        bestM = M_here;
                        bestm = m_here;
                    } else {
                        if (M_here > bestM || (M_here == bestM && m_here > bestm)) {
                            bestM = M_here;
                            bestm = m_here;
                        }
                    }
                }

                long value = (pow2[bestM] + pow2[bestm]) % MOD;
                resList.add(value);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < resList.size(); i++) {
                sb.append(resList.get(i));
                if (i < resList.size() - 1) {
                    sb.append(' ');
                }
            }
            out.println(sb);
        }
        out.close();
    }
}