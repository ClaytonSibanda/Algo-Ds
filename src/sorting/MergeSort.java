package sorting;

public class MergeSort 
{
	 void mergeSort(int[] a,int low,int high)
	{
		if(low<high)
		{
		int mid = (low + high)/2;
		mergeSort(a,low,mid);
		mergeSort(a,mid+1,high);
		merge(a,low,mid,high);
		}
	}
	 void merge(int []a,int s,int m,int e)
	{
		int n=e-s+1;
		int[] temp =new int[n];
		int i=s ,j=m+1;
		int k=0;
		while(i<=m && j<=e)
		{
				if(j>e)
					temp[k++]=a[i++];
				else if(i>m)
					temp[k++]=a[j++];
				else if(a[i]<a[j])
					temp[k++]=a[i++];
				else
					temp[k++]=a[j++];
		}
		for(int k1=0;k1<k;k1++)
		{	
			a[s+k1]=temp[k1];
		}
	}
	public static void main(String[] args) 
	{
		MergeSort m=new MergeSort();
		
		int a[]= {1,4,5,2,3,6};
		m.mergeSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		        System.out.println(a[i]);
	}
}
