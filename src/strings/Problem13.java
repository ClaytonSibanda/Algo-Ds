package strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Problem13 
{
		static int removeCharFromStringToConvertAnagram(String s,String s1)
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
		   for(int i=0;i<s.length();i++)
		   {	
				 if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i))>0)
				 {
					 m.put(s.charAt(i),m.get(s.charAt(i))-1);
					 tot--;
				 }
				 else
				 {
				//	  System.out.println(" "+s.charAt(i));
					  count++;
				 }
		   }
		   if(tot==0)
			   return count;
		   else
			   return -1;
		}
		public static void main(String[] args) 
		{
			
			// converting s to s1 
				String s= "helloJav";
				String s1="Java";
				int ans=-1;
				if((ans=removeCharFromStringToConvertAnagram(s,s1))==-1)
					System.out.println("Not Possible");
				else
					System.out.println("Total count = "+ans);
		}	
}	