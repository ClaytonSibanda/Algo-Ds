package strings;

import java.util.HashMap;
import java.util.Map;

public class Problem8 {

	static int countMaxRecurringChar(String s)
	{
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		int count=Integer.MIN_VALUE;
		char c=' ';
		for(int i=0;i<s.length();i++)
		{
			 if(m.get(s.charAt(i))!=null)
				   m.put(s.charAt(i),m.get(s.charAt(i))+1);
			 else
				   m.put(s.charAt(i),1);
			 
			 if(m.get(s.charAt(i))>count)
			 {	      count=m.get(s.charAt(i));
			 			c=s.charAt(i);
			 }
		}
		System.out.println("Max recurring character = "+c+", times = "+count);
		return count;
	}
	public static void main(String[] args) 
	{
			String s="JavaLanguage";
			countMaxRecurringChar(s);
	}
}