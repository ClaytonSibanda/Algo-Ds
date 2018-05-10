package arrays;

/*
 * 
 * Find missing number in a array where n-1 is array size and elements are upto n
 * 
 */

public class Problem2 {

	public static void main(String[] args) {
		
		   int a[]= {1,2,3,4};
		   
		   int xor=0;
		   for(int i=1;i<=a.length;i++)
		   {
			     xor^=a[i-1];
			     xor^=i;
		   }
		   System.out.println(xor^(a.length+1));
		 
	}
}
