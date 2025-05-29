import java.util.*;

public class Main{
	static Scanner sc= new Scanner(System.in);
	private static void solution(){
		String in=sc.next();
		Set<Character>s=new HashSet<>();
		s.add('A');s.add('a');
		s.add('I');s.add('i');
		s.add('O');s.add('o');
		s.add('E');s.add('e');
		s.add('U');s.add('u');
		s.add('Y');s.add('y');
		
		StringBuilder sb= new StringBuilder("");
		for(char c:in.toCharArray()){
			if(s.contains(c)){
				continue;
			}else{
				sb.append('.');
				sb.append(Character.toLowerCase(c));
			}
		}
		
		System.out.println(sb.toString());
	}
	public static void main(String[]x){
		solution();
	}
}