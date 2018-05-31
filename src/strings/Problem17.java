package strings;

// is it possible to convert the string into palindrome by changing one character

public class Problem17 {

	static boolean convertToPalindrome(String s)
	{
		int count=0;
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
						  count++;
		}
		if(count>1)
			return false;
		return true;
	}
	public static void main(String[] args) {
		
		
		
		//String s="abccaa";
		String s="abbcaa";
		
		System.out.println(((convertToPalindrome(s))?"yes":"no"));
	}
}
