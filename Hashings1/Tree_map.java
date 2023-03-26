import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Tree_map {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Map<Integer,String> ss=new TreeMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			 if(ss.containsKey(s.charAt(i))) {
				 ss.put(s.charAt(i),ss.get(s.charAt(i)+1);
			 }else {
				 ss.put(s.charAt(i),1);
			 }
			
		}
			System.out.println(ss);
	}

}
