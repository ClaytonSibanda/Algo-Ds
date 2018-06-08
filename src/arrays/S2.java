package arrays;

/*
 * Binary search
 * 
 * works only with ordered elements
 */
public class S2 
{
	static boolean binarySearch(int[] a,int low,int high,int key)
	{
		if(low>high)
			 return false;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==key)
				return true;
			else if(a[mid]>key)
				 high=mid-1;
			else
				low=mid+1;
		}
		return false;
		
		
	}
	public static void main(String[] args) 
	{
			int[] a= {1,2,3,4,5,6,7,8,9};
			int key=0;
			
			if(binarySearch(a,0,a.length-1,key))
				 System.out.println("Found");
			else
				System.out.println("Not Found");
	}
}
