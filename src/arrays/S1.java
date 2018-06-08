package arrays;

/*
 * Linear search
 * 
 * works fine with unordered elements
 */
public class S1 {

	static boolean linearSearch(int[] a,int key)
	{
		 for(int i=0;i<a.length;i++)
		 {
			  if(a[i]==key)
				    return true;
		 }
		 return false;
	}
	public static void main(String[] args) 
	{
			int[] a= {1,2,3,4,5,6,8,9,10};
		//	int key=7;
			int key=3;
			if(linearSearch(a,key))
					System.out.println("Found");
			else
					System.out.println("Not Found");
	}
}
