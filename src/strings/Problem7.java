package strings;

public class Problem7 
{
	static String convertCase(char a[])
	{
			for(int i=0;i<a.length;i++)
			{
					if(a[i]>=65 && a[i]<=91)
						 a[i]+=32;
					else if(a[i]>=97 && a[i]<=122)
						 a[i]-=32;
						
			}	
			return new String(a);
	}
	public static void main(String[] args) 
	{
		String s="mAsNIdH aPateL";
		System.out.println("Convert Case = "+convertCase(s.toCharArray()));
	}
}
