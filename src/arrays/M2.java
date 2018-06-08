package arrays;

public class M2 {

	static void missingNumber(int[] a,int n)
	{
		int x1=0,x2=0;
		 for(int i=0;i<a.length;i++)
			 x1^=a[i];
		 for(int i=1;i<=n;i++)
			 x2^=i;
		 
		 System.out.println("missing number = "+(x1^x2));
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5};
		
		int n=a.length+1;
		
		missingNumber(a,n);
		
	}
}
