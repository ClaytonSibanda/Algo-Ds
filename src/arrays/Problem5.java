package arrays;

/*
 * equilibrium in a array 
 * 
 */
public class Problem5 {

	public static void main(String[] args) 
	{
		   int a[]= {1,2,3,4,3,2,1};
		   //int a[]= {1,2,3,4,3,2,1,8};  //not exists
		   //int a[]= {1,2};  // less size array
		   
		   if(a.length>2)
		   {
			   	int lsum=a[0],rsum=0,equ=-1;
			   	for(int i=2;i<a.length;i++)
			   		rsum+=a[i];
			   	for(int i=1;i<a.length-1;i++)
			   	{
			   		   if(lsum==rsum)
			   		   {
			   			   equ=i;
			   		   }
			   		   lsum+=a[i];
			   		   rsum-=a[i+1];
			   	}
			   	if(equ!=-1)
			   		 System.out.println("equilbrium exsits at position = "+equ);
			   	else
			   		System.out.println("No equilibrium exists");
		   }
		   else
			   System.out.println("array lenght is less than 3");
	}
	
}
