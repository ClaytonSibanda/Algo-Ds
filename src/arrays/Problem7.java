package arrays;
/*
 * 
 * leaders in a array
 * 
 */
public class Problem7 {

	public static void main(String[] args) {
		
		
		int a[]= {16,17,4,3,5,2};
		
		int max=Integer.MIN_VALUE;
		String s="";
		for(int i=a.length-1;i>=0;i--)
		{
				if(max<a[i])
				{
					max=a[i];
					s=max+s;	
				}
		}
	System.out.println(s);	
	}
}
