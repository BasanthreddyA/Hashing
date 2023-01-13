//Minum opertions to make all elements equal:
//by using hashing we can reduce the code, key set stores the all elements keys
//TC=O(1)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={1,2,9,10,15,17,17,17};
		Map<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<a.length;i++){
		    if(hash.containsKey(a[i])){
		        hash.put(a[i],hash.get(a[i])+1);
		    }else{
		        hash.put(a[i],1);
		    }
		}
		int max_count=0;
		Set<Integer> s=hash.keySet();
		for(int i : s){
		    if(max_count<hash.get(i));
		    max_count=hash.get(i);
		}
		System.out.println(Math.abs(max_count-hash.size()));
	}
}

