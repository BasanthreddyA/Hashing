class Solution
{
    int maxDistance(int arr[], int n)
    {
	HashMap<Integer,Integer> map=new HashMap<>();//it stores distnict elements (elements , index)
	int max=0;
	
	for(int i=0;i<n;i++){
	    if(!map.containsKey(arr[i])){  // it checks arr elements not equals to map(hashMap)
	    map.put(arr[i],i);//(elements ,index) it stores
	    }
	    else{
	    max=Math.max(max,i-map.get(arr[i]));//it stores the max element(same indexes)
	    }
	}
	return max;
	
    }
}
