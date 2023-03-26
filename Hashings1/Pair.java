import java.util.HashSet;
import java.util.Scanner;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> n=new HashSet<>();
		int t=sc.nextInt();
		int[] a=new int[t];
		int k=sc.nextInt();
		for(int i=0;i<t;i++) {
			a[i]=sc.nextInt();
			n.add(a[i]);
		}
					
			for(int i=0;i<n.size();i++) {
				if(n.contains(a[i]-a[i+1]==k)) {
					System.out.println("Yes");
				}else {
					System.out.println("NO");
				}
			}
			
	}

}
