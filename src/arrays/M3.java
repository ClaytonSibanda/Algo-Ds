package arrays;

public class M3 {

	static void minimumDist(int[] a,int x,int y)
	{
			int prev=-1,i=0,mindist=Integer.MAX_VALUE;
			for(;i<a.length;i++)
			{
				 if(a[i]==x || a[i]==y)
				 {	 prev=i;
					 break;
				 }
			}
		for(;i<a.length;i++)
		{
			if(a[i]==x || a[i]==y)
			{
				if(a[prev]!=a[i] && i-prev <mindist)
				{
					 mindist= i-prev;
					 prev=i;
				}
				else
				{
					prev=i;
				}
			}
		}
		System.out.println("Minimun distance between "+x+" and "+y+" = "+mindist);
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,6,7,2,4,7};
		int x=2,y=7;
		minimumDist(a,x,y);
	}
}
