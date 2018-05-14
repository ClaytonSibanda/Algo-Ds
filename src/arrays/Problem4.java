package arrays;

/*
 * 
 *  sort array of 0's 1's and 2's 
 */
public class Problem4 {

	static void swap (int a[],int i,int j )
	{
		   int t=a[i];
		   a[i]=a[j];
		   a[j]=t;
	}
	public static void main(String[] args) 
	{
				int a[]= {0,1,2,2,1,0,0};
			                                                                                                 	
				int low=0,mid=0,high=a.length-1;
				while(mid<=high)
				{
						if(a[mid]==0)
						{
					    	     int t=a[low];
					    	     a[low]=a[mid];
					    	     a[mid]=t;
					    	     low++;
					    	     mid++;
						}
						else if (a[mid]==1)
						{
							mid++;
						}
						else
						{	
							  int t=a[high];
				    	      a[high]=a[mid];
				    	      a[mid]=t; 
				    	      high--;
				    	     
				    	}    	
				}
				for(int i=0;i<a.length;i++)
					System.out.println(a[i]);
	}
	
}
