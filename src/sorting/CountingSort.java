package sorting;

public class CountingSort 
{
	static int maximum(int[] a)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i	<a.length;i++)
		{
			  if(max<a[i])
				  max=a[i];
		}
		return max;
	}
	static void countingsort(int a[])
	{
		int max=maximum(a);
		
		int[] temp=new int[max+1];
		
		for(int i=0;i<a.length;i++)
			    temp[a[i]]++;
		
		for(int i=0,k=0;i<temp.length;i++)
		{
			while(temp[i]>0)
			{
				a[k++]=i;
				temp[i]--;
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {3,4,5,3,2,3,2,1,4,5,3,2,6};
		   countingsort(a);
		   
		   for(int i=0;i<a.length;i++)
			   System.out.println(a[i]);
	}
}
