package strings;

/*
 * 
 * reverse words in a string seprated by '.'
 */

public class Problem2 
{
	static String reverse(String s)
	{
		char[] a=s.toCharArray();
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		return new String(a);
	}
	public static void main(String[] args) 
	{
		String s="a.b.c.d.e.f";
		// reverse whole string
		s=reverse(s);
		// reverse each word;
		String s1="";
		for(int i=0,j=0;i<s.length();i++)
		{
			 if(s.charAt(i)=='.')
			 {	 	s1+=reverse(s.substring(j, i))+".";
			 		j=i+1;
			 }
			 else if(i==s.length()-1)
			 {
				  s1+=reverse(s.substring(j,i+1));
			 }
		} 
		System.out.println(s1);
	}
}
