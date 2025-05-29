import java.util.*;


public class Main{
	
	static Scanner sc = new Scanner(System.in);
	private static void solution(){
		int k=sc.nextInt();
		String in=sc.next();
		Set<Character>s=new HashSet<>();
		Map<Character,Integer>m=new HashMap<>();
		Map<Character,Integer>m2=new HashMap<>();
		
		
		for(char c:in.toCharArray()){
			s.add(c);
			m.put(c,m.getOrDefault(c,0)+1);
		}
		
		for(char c:s){
			if((m.get(c))%k==0){
				m2.put(c,m.get(c)/k);
			}
			else{
				System.out.println(-1);
				return;
			}
		}
		
		StringBuilder sb1=new StringBuilder("");
		for(char c:s){
			for(int i=1;i<=m2.get(c);i++){
				sb1.append(c);
			}
		}
		
		StringBuilder ans=new StringBuilder("");
		for(int i=0;i<k;i++){
			ans.append(sb1);
		}
		
		System.out.println(ans.toString());
	}
	public static void main(String[]x){
		solution();
	}
}