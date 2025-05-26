import java.util.*;
import java.io.*;

public class Main {
    static class Pair {
        int position;
        int a;

        Pair(int position, int a) {
            this.position = position;
            this.a = a;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine();
            int[] a = new int[n];
            String[] aStr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(aStr[i]);
            }

            List<Pair> B = new ArrayList<>();
            List<Pair> R = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    B.add(new Pair(i, a[i]));
                } else {
                    R.add(new Pair(i, a[i]));
                }
            }

            B.sort(Comparator.comparingInt(p -> p.position));
            R.sort(Comparator.comparingInt(p -> p.position));

            int low = 0;
            int high = 0;
            for (Pair p : B) {
                high = Math.max(high, p.a);
            }
            for (Pair p : R) {
                high = Math.max(high, p.a);
            }

            int answer = high;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (isPossible(B, R, mid, k, n)) {
                    answer = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(answer);
        }
    }

    private static boolean isPossible(List<Pair> B, List<Pair> R, int X, int k, int n) {
        List<Integer> forbiddenRed = new ArrayList<>();
        for (Pair p : R) {
            if (p.a > X) {
                forbiddenRed.add(p.position);
            }
        }
        forbiddenRed.sort(Integer::compareTo);

        List<int[]> allowedRegions = new ArrayList<>();
        int prev = -1;
        for (int pos : forbiddenRed) {
            if (prev == -1) {
                if (pos > 0) {
                    allowedRegions.add(new int[]{0, pos - 1});
                }
            } else {
                if (pos > prev + 1) {
                    allowedRegions.add(new int[]{prev + 1, pos - 1});
                }
            }
            prev = pos;
        }
        if (prev != -1) {
            if (prev < n - 1) {
                allowedRegions.add(new int[]{prev + 1, n - 1});
            }
        } else {
            allowedRegions.add(new int[]{0, n - 1});
        }

        int totalIntervals = 0;
        for (int[] region : allowedRegions) {
            int L = region[0];
            int R_region = region[1];
            if (L > R_region) {
                continue;
            }

            int first = findFirst(B, L);
            if (first == -1) {
                continue;
            }

            int last = findLast(B, R_region);
            if (last == -1) {
                continue;
            }

            int currentBlocks = 0;
            int lastPos = -2;
            for (int i = first; i <= last; i++) {
                Pair p = B.get(i);
                if (p.position < L || p.position > R_region) {
                    continue;
                }
                if (p.a > X) {
                    if (p.position != lastPos + 1) {
                        currentBlocks++;
                    }
                    lastPos = p.position;
                }
            }
            totalIntervals += currentBlocks;
        }

        return totalIntervals <= k;
    }

    private static int findFirst(List<Pair> list, int target) {
        int left = 0, right = list.size() - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int pos = list.get(mid).position;
            if (pos >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res == -1 ? -1 : (list.get(res).position >= target ? res : -1);
    }

    private static int findLast(List<Pair> list, int target) {
        int left = 0, right = list.size() - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int pos = list.get(mid).position;
            if (pos <= target) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res == -1 ? -1 : (list.get(res).position <= target ? res : -1);
    }
}