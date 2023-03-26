import java.util.HashMap;
import java.util.Scanner;

public class HashMappre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();	
			}

	
	HashMap<Integer,Integer> mp=new HashMap<>();
	 for(int i=0;i<size;i++) {
		 if(mp.containsKey(i)) {
			 mp.put(a[i],i+1);
		 }else {
			 mp.put(a[i],1);
		 }
	 }
	 
	}
}
