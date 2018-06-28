package sorting;

public class SelectionSort 
{
	static void selectionSort(int [] a)
	{
		 int n=a.length;
		 for(int i=0;i<n;i++)
		 {
			 int index=i;
			 for(int j=i+1;j<n;j++)
			 {
				    if(a[index]>a[j])
				    	index=j;
			 }
			 if(index!=i)
			 {
				 int temp = a[index];
				 a[index]=a[i];
				 a[i]=temp;
			 }
		 }
		 for(int i=0;i<a.length;i++)
			   System.out.println(a[i]);	
	}
	public static void main(String[] args) 
	{
		 int a[]= {1,4,5,2,3,6};
		 selectionSort(a);
	}
	
}
