package arrays;
/*
 * leaders in an array
 * 
 */
public class M4 {

	static void leaders(int[]a)
	{
		 int prevmax=Integer.MIN_VALUE;
		 for(int i=a.length-1;i>=0;i--)
		 {
			 	 if(prevmax<a[i])
			 	 {
			 		 System.out.println(a[i]);
			 		 prevmax=a[i];
			 	 }
		 }
	}
	public static void main(String[] args) 
	{
		  // int a[]= {1,2,3,4,5,6,7};
		   int a[]= {2,3,11,2,6,7,5,3,4,2};			   
		   
		   leaders(a);
	}
}
