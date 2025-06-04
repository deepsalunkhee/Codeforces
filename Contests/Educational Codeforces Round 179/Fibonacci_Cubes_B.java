import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private static boolean check(int l,int w,int h,int[] cubes) {
        
        
        int n=cubes.length;
        for(int i=0;i<n/2;i++) {
            int temp=cubes[i];
            cubes[i]=cubes[n-1-i];
            cubes[n-1-i]=temp;
        }

       
        int[][] box=new int[l][w]; //box[i][j]=heigh of that place

        for(int cube:cubes){
            boolean placed=false;

           
            for(int i=0;i<=l-cube && !placed;i++){
                for(int j=0;j<= w-cube && !placed;j++){
                    int mh=0;

                    //check h
                    for(int x=i;x<i+cube;x++) {
                        for (int y=j;y<j+cube;y++) {
                            mh=Math.max(mh,box[x][y]);
                        }
                    }

                    
                    if(mh+cube>h)continue;

                    //check base
                    boolean canPlace=true;
                    for(int x=i;x<i+cube && canPlace;x++){
                        for (int y=j;y<j+cube && canPlace;y++){
                            if (box[x][y]!=mh)canPlace=false;
                        }
                    }

                    if(canPlace){
                        for(int x=i;x<i+cube;x++){
                            for(int y=j;y<j+cube;y++){
                                box[x][y]+=cube;
                            }
                        }
                        placed=true;
                    }
                }
            }

            //cant place
            if (!placed) return false;
        }

        // All cubes placed successfully
        return true;
    }
	private static void solution() throws IOException {
		
		String[]dim=br.readLine().split(" ");
		int n=Integer.parseInt(dim[0]);
		int m=Integer.parseInt(dim[1]);
		int[][]boxes=new int[m][3];
		int []fb=new int[n];
		fb[0]=1;
		fb[1]=2;
		for(int i=2;i<n;i++){
			fb[i]=fb[i-1]+fb[i-2];
		}
		
		for(int i=0;i<m;i++){
			String[]t=br.readLine().split(" ");
			boxes[i][0]=Integer.parseInt(t[0]);
			boxes[i][1]=Integer.parseInt(t[1]);
			boxes[i][2]=Integer.parseInt(t[2]);
		}
		
		StringBuilder ans=new StringBuilder("");
		
		for(int i=0;i<m;i++){
			if(check(boxes[i][0],boxes[i][1],boxes[i][2],fb))
			ans.append(1);
			else
			ans.append(0);
		}
		
		System.out.println(ans.toString());
		
	}
	
	public static void main(String[]x) throws IOException {
		
		int t=Integer.parseInt(br.readLine());
		
		while(t-->0)
		solution();
	}
}