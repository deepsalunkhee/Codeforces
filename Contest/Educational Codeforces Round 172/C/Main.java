import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static ArrayList<int[]> arr;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tes=sc.nextInt();
        while(tes-->0){
            int n=sc.nextInt(),k=sc.nextInt(),i,alice=0,bob=0,ans=1,sum=0;
            String s=sc.next();
            int a[]=new int[n];
            for(i=0;i<n;i++) a[i]=(s.charAt(i)-'0');
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            for(i=n-1;i>0;i--){
                if(a[i]==0) alice++;
                else bob++;
                if(bob>alice) pq.add(bob-alice);
            }
            //System.out.println(pq);
            while(pq.size()>0 && sum<k){
                sum+=pq.poll();
                ans++;
            }
            if(sum>=k) System.out.println(ans);
            else System.out.println(-1);
        }
    }
}