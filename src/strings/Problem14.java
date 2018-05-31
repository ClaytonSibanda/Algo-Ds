package strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Problem14 
{
	static String convert(String s,String s1)
	{
			int tot=0;
			int count = 0;
			Map<Character,Integer> m=new TreeMap<Character,Integer>();
		   
		   for(int i=0;i<s1.length();i++)
		   {
			  if(s1.charAt(i)!=' ')	
			  {
				 if(m.get(s1.charAt(i))!=null)
					   m.put(s1.charAt(i),m.get(s1.charAt(i))+1);
				 else
					   m.put(s1.charAt(i),1);
			  tot++;
			  }
		   }
		   String s2="";
		   for(int i=0;i<s.length();i++)
		   {	
				 if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i))>0)
				 {
					 m.put(s.charAt(i),m.get(s.charAt(i))-1);
					 tot--;
				 }
				 else
				 {
					  s2+=s.charAt(i);
					  count++;
				 }
		   }
		   return s2;
	}
	public static void main(String[] args) 
	{
			
			// converting s to s1 
				String s= "helloJava1";
				String s1="Java";
				int ans=-1;
				System.out.println("Character removed from first string present in second string = "+convert(s,s1));
	}	
}	