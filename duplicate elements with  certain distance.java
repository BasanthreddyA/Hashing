/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int[] a={12,23,34,23,17,78,96,12};
	    int k=5;
	    for(int i=0;i<a.length;i++){
	        for(int j=1;j<a.length;j++){
	            if(a[i]==a[j]){
	                int c=Math.abs(i-j);
	                if(c<=k){
	                    System.out.println("yes");
	                    return;
	                }
	                else{
	                    System.out.println("no");
	                    return;
	                }
	            }
	        }
	    }
	//	System.out.println("Hello World");
	}}
