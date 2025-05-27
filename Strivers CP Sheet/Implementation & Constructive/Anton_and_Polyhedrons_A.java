import java.util.*;
import java.io.*;

public class Main{
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	private static void solution() throws IOException{
		//declareing the map
		Map<String,Integer>m=new HashMap<>();
		m.put("Tetrahedron",4);
		m.put("Cube",6);
		m.put("Octahedron",8);
		m.put("Dodecahedron",12);
		m.put("Icosahedron",20);
		
		long ans=0;
		
		
		long n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			String t=br.readLine();
			ans+=m.get(t);
		}
		
		System.out.println(ans);
	}
	public static void main(String x[]) throws IOException{
		solution();
	}
}