import java.util.*;

public class Main{
	static Scanner sc=new Scanner(System.in);
	private static void solution(){
		String s=sc.next();
		
	    Set<Character>set=new HashSet<>();
		
		for(char c:s.toCharArray()){
			set.add(c);
		}
		
		
		if(set.size()%2==0){
			System.out.println("CHAT WITH HER!");
		}else{
			System.out.println("IGNORE HIM!");
		}
	}
	public static void main(String[]x){
		solution();
	}
}