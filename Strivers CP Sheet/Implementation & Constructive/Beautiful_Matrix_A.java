import java.util.*;
import java.io.*;


public class Main {
	
	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static void solution() throws IOException{
		int[][] in= new int[5][5];
		for(int i=0;i<5;i++){
			String[]temp=br.readLine().split(" ");
			for(int j=0;j<5;j++){
				in[i][j]=Integer.parseInt(temp[j]);
				if(in[i][j]==1){
					System.out.println(Math.abs(2-i)+Math.abs(2-j));
			
				}
			}
		}
	}
	public static void main(String x[]) throws IOException {
		solution();
	}
}