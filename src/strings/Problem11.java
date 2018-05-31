package strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Problem11 
{
	static int countMaxRecurringChar(String s)
	{
		int count = 0;
		
		Map<Character,Integer> m=new TreeMap<Character,Integer>();

		char c=' ',c2=' ';
		for(int i=0;i<s.length();i++)
		{
			 if(m.get(s.charAt(i))!=null)
				   m.put(s.charAt(i),m.get(s.charAt(i))+1);
			 else
				   m.put(s.charAt(i),1);
		}
		for(Map.Entry<Character, Integer> e:m.entrySet())
		{
			 if(e.getValue()>1)
			 {
				  System.out.println(e.getKey() +" "+ e.getValue());
				  count++;
			 }
		}
		return count;
	}
	public static void main(String[] args) 
	{
			String s="JavaLanguage";
			System.out.println("Total count = "+countMaxRecurringChar(s));
	}
}