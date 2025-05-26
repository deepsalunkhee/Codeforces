import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long k=sc.nextLong(),l=(long)Math.sqrt(k),p=(long)Math.sqrt(k+l);
            if(p*p>k+l)k--;
            System.out.println(k+p);
        }
    }
}