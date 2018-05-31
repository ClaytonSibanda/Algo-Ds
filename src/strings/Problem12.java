package strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Problem12 
{
		static int printCommonCharacter(String s,String s1)
		{
			int count = 0;
			Map<Character,Integer> m=new TreeMap<Character,Integer>();

			char c=' ',c2=' ';
			for(int i=0;i<s1.length();i++)
			{
				 if(m.get(s1.charAt(i))!=null)
					   m.put(s1.charAt(i),m.get(s1.charAt(i))+1);
				 else if(s1.charAt(i)!=' ')
					   m.put(s1.charAt(i),1);
			}
			for(int i=0;i<s.length();i++)
			{
				 if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i))>0)
				 {
					  System.out.println(s.charAt(i));
					  m.put(s.charAt(i), m.get(s.charAt(i))-1);
					  count++;
				 }
			}
			return count;
		}
		public static void main(String[] args) 
		{
				String s="Java oak";
				String s1= "hello java";
				System.out.println("Total count = "+printCommonCharacter(s,s1));
		}	
}
