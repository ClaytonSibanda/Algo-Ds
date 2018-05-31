package strings;

public class Problem4 {

	static String reverse(char a[])
	{
		   for(int i=0,j=a.length-1;i<j;i++,j--)
		   {
			       char temp=a[i];
			       a[i]=a[j];
			       a[j]=temp;
		   }
		   return new String(a);
	}
	
	static String reverseRec(String s)
	{
		if(s.length()==1)
			return s;
		String s1=reverseRec(s.substring(1));
		return s1=s.charAt(0)+s1;
	}
	static String reverse1(char a[])
	{
          return reverseRec(new String(a));		  
	}
	public static void main(String[] args) {
		 
		     String s="Manish";
		     char a[]=s.toCharArray();
		     System.out.println("reverse = "+(reverse(a)));
		     System.out.println("reverse through recursion = "+reverse1(a));
	}
}
