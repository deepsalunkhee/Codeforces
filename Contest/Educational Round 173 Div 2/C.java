import java.util.*;

public class Main {
    static class R {
        long a, b;
        R(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        while(t-- > 0) {
            List<R> r = new ArrayList<>();
            int n = s.nextInt();
            ArrayList<Long> l = new ArrayList<>();
            ArrayList<Long> m = new ArrayList<>();
            long x = 0;
            boolean f = true;
            
            for(int i = 0; i < n; i++) {
                long v = s.nextLong();
                if(v != 1 && v != -1) {
                    x = v;
                    f = false;
                } else if(f) {
                    l.add(v);
                } else {
                    m.add(v);
                }
            }
            
            // Left sums
            long a = Long.MAX_VALUE, b = Long.MIN_VALUE;
            if(l.isEmpty()) {
                a = b = 0;
            } else {
                long u = 0;
                for(long v : l) {
                    u += v;
                    a = Math.min(a, u);
                    b = Math.max(b, u);
                }
                a = Math.min(a, 0);
                b = Math.max(b, 0);
            }
            
            // Right sums
            long c = Long.MAX_VALUE, d = Long.MIN_VALUE;
            if(m.isEmpty()) {
                c = d = 0;
            } else {
                long u = 0;
                for(long v : m) {
                    u += v;
                    c = Math.min(c, u);
                    d = Math.max(d, u);
                }
                c = Math.min(c, 0);
                d = Math.max(d, 0);
            }
            
            // Add ranges
            r.add(new R(a, b));
            r.add(new R(c, d));
            r.add(new R(b + x + c, a + x + d));
            r.add(new R(0, 0));
            
            Collections.sort(r, (p, q) -> p.a != q.a ? 
                           Long.compare(p.a, q.a) : Long.compare(p.b, q.b));
            
            // Merge ranges
            List<R> g = new ArrayList<>();
            for(R h : r) {
                if(g.isEmpty()) g.add(h);
                else {
                    R j = g.get(g.size()-1);
                    if(h.a <= j.b + 1) j.b = Math.max(j.b, h.b);
                    else g.add(h);
                }
            }
            
            // Collect sums
            TreeSet<Long> w = new TreeSet<>();
            for(R h : g) {
                for(long v = h.a; v <= h.b; v++) w.add(v);
            }
            
            System.out.println(w.size());
            for(long v : w) System.out.print(v + " ");
            System.out.println();
        }
    }
}