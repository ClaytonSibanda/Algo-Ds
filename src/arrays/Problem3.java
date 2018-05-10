package arrays;

/*
 * 
 * Find the subarray in a array with given sum.
 * 
 */
public class Problem3 {

	public static void main(String[] args) {
		
		int sum=5;
		int a[]= {15, 2, 4, 8, 9, 5, 10, 23}; //{0,1,4,6,2,8,5,9}
		int i=0,j=0;
		int temp=0;
		boolean flag=false;
		for(;i<a.length;)
		{
			if(temp>sum)
			{
				 temp-=a[j];
				 j++;
			}
			else if(temp==sum)
			{
					System.out.println("Found");
					flag=true;
					break;
			}
			else 
			{
				 temp+=a[i];
				  i++;
			}
		}
		if(flag==false)
			System.out.println("sum is not present in array");
		
	}	
}
