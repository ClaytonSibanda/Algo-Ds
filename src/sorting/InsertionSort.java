package sorting;

public class InsertionSort {

	static void insertionSort(int [] a)
	{
		
		 int n=a.length;
		 
		 for(int i=0;i<n;i++)
		 {
			 int temp=a[i];
			 int j=i-1;
			 while(j>=0 && a[j]>temp)
			 {
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=temp;
		 }
		 for(int i=0;i<a.length;i++)
			   System.out.println(a[i]);
		 	
	}
	public static void main(String[] args) {
	
		
		 int a[]= {1,4,5,2,3,6};
		 insertionSort(a);
	}
}