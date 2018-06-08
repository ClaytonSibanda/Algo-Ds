package arrays;

public class M5 {

	static void majority(int []a)
	{
		int count=1;
		int max=0;
		for(int i=1;i<a.length;i++)
		{
			 if(a[max]==a[i])
			 {
				 count++;
			 }
			 else
			 {
				 count--;
			 }
			 if(count==0)
			 {
				 max=i;
				 count=1;
			 }
			 System.out.println(count);
		}
		System.out.println("majority element = "+a[max]);
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,2,2,3,2,2,3,2,2};
		
		majority(a);
	}
}
