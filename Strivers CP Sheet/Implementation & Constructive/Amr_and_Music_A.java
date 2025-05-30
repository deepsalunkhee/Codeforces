import java.util.*;


public class Main{
	
	static Scanner sc= new Scanner(System.in);
	private static void solution(){
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[][]a=new int[n][2];
		for(int i=0;i<n;i++){
			a[i][0]=sc.nextInt();
			a[i][1]=i;
		}
		
		Arrays.sort(a,(a1,a2)->{
			return a1[0]-a2[0];//this is not safe
			});
		int c=0;
		
		for(int i=0;i<n;i++){
			if(k>=a[i][0]){
				c++;
				k-=a[i][0];
			}else{
				break;
			}
		}
		
		System.out.println(c);
		for(int i=0;i<c;i++)
		System.out.print(a[i][1]+1+" ");
	}
	public static void main(String[]x){
		solution();
	}
}