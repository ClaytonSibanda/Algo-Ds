package arrays;
/*
 * 
 * kadane theorem
 * 
 */
public class Problem1 {

	public static void main(String[] args) {
		
		
		//int a[]= {100,200,1,-4,-1,7,0,0,-2,-5};
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		int max=a[0];
		int cur=a[0];
		
		int start =0,end=0;
		for(int i=1;i<a.length;i++)
		{
			
			if((a[i]+cur)>a[i])
			{	 cur+=a[i];
				 
			}
			else
			{	  cur=a[i];
				  start=i;	
			}
			if(max<cur)
			{	max=cur;
				end=i;
			}
			
		
		}
		System.out.println(max);
		System.out.println(start+"  "+end);
	}
}
