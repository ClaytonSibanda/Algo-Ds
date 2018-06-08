package arrays;

public class M7 {

	static void replace(int [] a)
	{
		int next=-1;
		int curr=Integer.MIN_VALUE;
		   for(int i=a.length-1;i>=0;i--)
		   {
			   	if(a[i]>curr)
			   	{
			   		 curr=a[i];
			   	}
			     a[i]=next;
			     next=curr;
		   }
		   for(int i=0;i<a.length;i++)
		   {
			    System.out.print(a[i]+" ");
		   }
	}
	public static void main(String[] args) 
	{
		int []a = {1,8,4,7,2,4,1};
		
		
		replace(a);
	}
}
