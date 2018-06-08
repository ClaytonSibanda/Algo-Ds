package arrays;
/*
 * rotate an array  juggling algorithm 
 */
public class Problem6 {

	static int gcd(int a,int b)
	{
		int g=1;
		if(b>a)
			 return -1;
		
		for(int i=1;i<a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				g=i;
			}
		}
		
		return g;
	}
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8};
		int d=2;
		int n=a.length;
		for(int i=0;i<gcd(a.length,d);i++)
		{
			int j=i;
			int temp=a[i];
			int k=0;
			while(true)
			{	
				k=j+d;
				if(k>=n)
				   k-=n;
				if(k==i)
				   break;
				a[j]=a[k];
				j=k;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
