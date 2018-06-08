package arrays;

/*
 * 
 * Union and Intersection of an array.
 * 
 */

public class M1 {

	static void union(int a[],int b[])
	{
			int i=0,j=0;
			System.out.print("Union = ");
			for(;i<a.length && j<b.length;)
			{
				if(a[i]<b[j])
				{
					System.out.print(a[i]+" ");
					i++;
				}
				else if(a[i]>b[j])
				{
					System.out.print(b[i]+" ");
					j++;
				}
				else
				{
					System.out.print(a[i]+" ");
					i++;
					j++;
				}	
			}
			while(i<a.length)
			{
				System.out.print(a[i]+" ");
				i++;
			}
			while(j<b.length)
			{
				System.out.print(b[j]+" ");
				j++;
			}
	}
	static void intersection(int a[],int b[])
	{
			int i=0,j=0;
			System.out.print("\nIntersection = ");
			for(;i<a.length && j<b.length;)
			{
				if(a[i]<b[j])
				{
					i++;
				}
				else if(a[i]>b[j])
				{
					j++;
				}
				else
				{
					System.out.print(a[i]+" ");
					i++;
					j++;
				}	
			}
	}
	public static void main(String[] args) 
	{	
			 int a[]= {1,2,3,4};
			 int b[]= {2,3,4,5,6,9};
			 
			 union(a,b);
			 intersection(a,b);
	}
}