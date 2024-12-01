import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	private static void print2d(char[][]arr,int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	private static void printInt(int a){
		System.out.println(a);
	}
	
	private static void printChar(char a){
		System.out.println(a);
	}
	
	private static void DFS(char[][] arr,int startR,int startC,int n,int m){
		// Directions: down, right, up, left
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        
        // Stack to simulate recursion
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startR, startC});
        
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int r = current[0];
            int c = current[1];
            
            // Skip if already visited
            if (arr[r][c] != '.') continue;
            
            // Mark as visited
            arr[r][c] = '#';
            
            // Check all 4 directions
            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                
                // Check if new position is valid and is a floor tile
                if (nr >= 0 && nc >= 0 && nr < n && nc < m && arr[nr][nc] == '.') {
                    stack.push(new int[]{nr, nc});
                }
            }
        }
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		//printInt(n);
		//printInt(m);
		
		//the building
		char[][] bu=new char[n][m];
		
		for(int i=0;i<n;i++){
			 bu[i]=sc.next().toCharArray();
		}
		
		//print2d(bu,n,m);
		
		int ans=0;
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(bu[i][j]=='.'){
					ans++;
					DFS(bu,i,j,n,m);
				}
			}
		}
		printInt(ans);
	}
}