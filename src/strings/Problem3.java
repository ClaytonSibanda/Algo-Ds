package strings;
public class Problem3 
{
	static void permute(char a[],int l,int r)
	{
		if(l==r)
		{
			System.out.println(a);
			return;
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				char temp=a[l];
				a[l]=a[i];
				a[i]=temp;
				permute(a,l+1,r);
				temp=a[l];
				a[l]=a[i];
				a[i]=temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		  char a[]= {'A','B','C'};
		  permute(a,0,a.length-1);
	}
}