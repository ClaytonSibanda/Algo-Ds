package arrays;

/*
 * 
 * find the number occuring odd number of times.
 */
public class M6 
{
	static void oddnumbertimes(int []a)
	{
		int x=0;
		 for(int i=0;i<a.length;i++)
			  x^=a[i];
		 
		 System.out.println(x);
	}
	public static void main(String[] args) 
	{
		   int a[]= {1,2,3,5,3,2,1};
		   
		   oddnumbertimes(a);
	}
}
