package strings;
public class Problem9 
{
	static int countWords(String s)
	{
		boolean state=false;
		int noWords=0;
		for(int i=0;i<s.length();i++)
		{
			 if(s.charAt(i)==' ' || s.charAt(i)=='\n' || s.charAt(i)=='\t')
				       	   state=true;
			 else if(state==true)
			 {   
				 state=false;
			   	 noWords++; 
			 }	    
		}
		return noWords;
	}
	public static void main(String[] args) 
	{
		String s="java is \n programming language 	.";
		System.out.println("Count the words = "+countWords(s));
	}
}