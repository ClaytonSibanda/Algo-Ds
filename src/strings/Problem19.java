package strings;

// string 1 is a subsequenc of string 2. 
public class Problem19 
{
	static boolean checkSubsequence(String s, String s1)
	{
		if(s1.length()>s.length())
			 return false;
		
		int count=0;
		int j=0;
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)==s1.charAt(j))
							j++;
				
		}
		if(s1.length()==j)
			 return true;
		return false;
	}
	public static void main(String[] args) 
	{
		String s="JavaLanguage";
		String key="age";
		//String key="age1";
		if(checkSubsequence(s,key))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
