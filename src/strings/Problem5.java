package strings;

public class Problem5 {

	static int fibosolution(int n)
	{
		int f0=0,f1=1,f2=0;
		while(n!=-1)
		{
			 n--;
			 f2=f1+f0;
			 f0=f1;
			 f1=f2;
		}
		return f2;
	}
	static int DPSolution(int n)
	{
		int[]a=new int[n];
		int[]b=new int[n];
		
		a[0]=1;
		b[0]=1;
		int i=0;
		for(i=1;i<n;i++)
		{
			a[i]=a[i-1]+b[i-1];
			b[i]=a[i-1];
		}
		return a[n-1]+b[n-1];
	}
	public static void main(String[] args) 
	{
		 	 int n=3;
		 	 System.out.println("Fibonacci solution = "+fibosolution(n));
		 	 System.out.println("Fibonacci solution DP solution = "+DPSolution(n));	
	}
}
