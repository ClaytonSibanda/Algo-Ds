package strings;

public class Problem18 {

	static String recurringDigits(String s)
	{
		String s1="";
		s1+=s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
		  	 	if(s.charAt(i-1)!=s.charAt(i))
		  	 	{
		  	 		s1+=s.charAt(i);
		  	 	}
		}
		
		return s1;
	}
	public static void main(String[] args) 
	{
		String s="11122223333334444";
	
		System.out.println("Removed Recurring digits :- "+recurringDigits(s));
	}
}
