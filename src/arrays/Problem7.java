package arrays;
/*
 * Reversal algorithm : rotate of the array.
 */
public class Problem7 
{
	static int[] reverse(int []a,int s,int e)
	{
		for(int i=s,j=e;i<j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return a;
	}
	public static void main(String[] args) 
	{
			int a[]= {1,2,3,4,5,6,7};
			int d=3;
			int n=a.length;
			
			int starta=0;
			int enda=d-1;
			int startb=d;
			int endb=n-1;
			
			a=reverse(a,starta,enda);
			a=reverse(a,startb,endb);
			a=reverse(a,0,n-1);
			for(int i=0;i<a.length;i++)
				  System.out.println(a[i]);
	}
}
