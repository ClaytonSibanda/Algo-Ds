package arrays;

public class M8 
{
	static int fixedPoint(int[] a,int low,int high)
	{
		while(low<=high)
		{
				int mid=low+(high-low)/2;
		
				if(a[mid]==mid)
					return mid;
		
				if(a[mid]<mid)
					low=mid+1;
				else
					high=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		   int []a= {1,2,3,4,4,6,7,8,9};
		   System.out.println(fixedPoint(a,0,a.length-1));
	}
}
