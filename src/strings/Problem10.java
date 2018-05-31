package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Problem10 
{
	static int countMaxRecurringChar(String s)
	{
		int first = Integer.MIN_VALUE;
		int second= Integer.MAX_VALUE;
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		int count=Integer.MIN_VALUE;
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
			 
			 if((int)e.getValue()>=first)
			 {	      
				 		second=first;
				 		c=c2;
				 		first=(int)e.getValue();
				 		c2=(char)e.getKey();
			 }
			 else if((int)e.getValue()>second && (int)e.getValue()<first)
			 {
				 second=(int) e.getValue();
				 c=(char) e.getKey();
			 }
		}
		System.out.println("Second recurring character = "+second + " times , characeter = "+c);
		return second;
	}
	public static void main(String[] args) 
	{
			String s="JavaLanguage";
			countMaxRecurringChar(s);
	}
}