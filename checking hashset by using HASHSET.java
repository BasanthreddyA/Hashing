import java.util.*;  
class Main 
{  
    static boolean Check_Duplicates(int a[], int k)  
    {  
        HashSet<Integer> D_set = new HashSet<>();  
        for (int i=0; i<a.length; i++)  
        {  
            if (D_set.contains(a[i]))  
                return true;  
            D_set.add(a[i]);  
            if (i >= k)  
                D_set.remove(a[i-k]);  
        }  
        return false;  
    }  
    public static void main (String[] args)  
    {  
        int a[] = {1, 2, 3, 4, 1};  
        int k = 5;  
        if (Check_Duplicates(a, k))  
            System.out.println("Yes");  
        else  
            System.out.println("No");  
    }  
}  