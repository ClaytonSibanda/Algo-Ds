package sorting;

public class QuickSort {

	static void quickSort(int [] a,int s,int e)
	{
		if(s<e)
		{
			int p=partition(a,s,e);
			quickSort(a, s, p-1);
			quickSort(a, p+1, e);
		}
	}
	private static int partition(int[] a, int s, int e) 
	{
		
		int i=s+1,j=s+1;
		int pivot=a[s];
		while(j<=e)
		{
			if(a[j]<pivot)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
			}
			j++;
		}
		i--;
		int t=a[i];
		a[i]=a[s];
		a[s]=t;
		
		return i;
	}
	public static void main(String[] args) 
	{
			 int a[]= {1,4,5,2,3,6};
			 quickSort(a,0,a.length-1);	
			 for(int i=0;i<a.length;i++)
				 System.out.println(a[i]);
	}
}
