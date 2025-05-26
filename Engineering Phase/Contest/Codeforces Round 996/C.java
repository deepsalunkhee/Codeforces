import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tes=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        label:while(tes-->0){
            int n=sc.nextInt(),m=sc.nextInt(),i,j;
            String s=sc.next();
            s+="D";
            long a[][]=new long[n][m];
            for(i=0;i<n;i++)
            for(j=0;j<m;j++) a[i][j]=sc.nextLong();
            int x=0,y=0;
            for(i=0;i<s.length();i++){
                if(s.charAt(i)=='D'){
                    long sum=0;
                    for(j=0;j<m;j++) sum+=a[x][j];
                    a[x][y]=-sum;
                    x++;
                }
                else{
                    long sum=0;
                    for(j=0;j<n;j++) sum+=a[j][y];
                    a[x][y]=-sum;
                    y++;
                }
            }
            for(i=0;i<n;i++){
                for(j=0;j<m;j++) sb.append(a[i][j]+" ");
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}