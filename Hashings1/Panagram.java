import java.util.HashSet;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashSet<Character> ss=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			ss.add(s.charAt(i));
		}
		if(ss.size()==26) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		

	}

}
Set Panagram


