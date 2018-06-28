package sorting;

public class BubbleSort {

	static void bubbleSort(int [] a)
	{
		
		 int n=a.length;
		 
		 for(int i=a.length-1;i>=1;i--)
		 {
			  boolean check =false;
			  
			 for(int j=0;j<i;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					  check =true;
					  int temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;	  
				 }
			 }
			 if(check==false)
				  break;
		 }
		 
		 for(int i=0;i<a.length;i++)
			   System.out.println(a[i]);
		 	
	}
	public static void main(String[] args) {
	
		
		 int a[]= {1,4,5,2,3,6};
		 bubbleSort(a);
	}
}
