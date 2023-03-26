package;

//import java.time.*;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class Tips {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
	System.out.println(path(s));
	}

	public static float path(String s) {
		int x=0,y=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='N') {
				y++;
			}else if(s.charAt(i)=='S') {
				y--;
			}else if(s.charAt(i)=='E') {
				x++;
			} else if(s.charAt(i)=='W') {
				x--;
			}
		}
		int x2=x*x;
		int y2=y*y;
		return (float) Math.sqrt(x2-y2);
	}

}
