package arrays;

/*
 * Interpolation search
 * 
 * works only with ordered elements and more refined then binary search
 * 
 */
public class S3 
{
	static boolean interpolationSearch(int[] a,int low,int high,int key)
	{
		if(low>high)
			 return false;
		int pos=0;
		while(low<=high && key>=a[low] && key<=a[high])
		{
			pos=(int)(low+((high-low)*(key-a[low]))/(a[high]-a[low]));
			if(a[pos]==key)
				return true;
			else if(a[pos]>key)
				 high=pos-1;
			else
				low=pos+1;
		}
		return false;
		
		
	}
	public static void main(String[] args) 
	{
			int[] a= {1,2,3,4,5,6,7,8,9};
			int key=1;
			
			if(interpolationSearch(a,0,a.length-1,key))
				 System.out.println("Found");
			else
				System.out.println("Not Found");
	}
}
