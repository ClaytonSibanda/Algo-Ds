package strings;

// Check balanced parenthesis.
// find max as well

public class Problem6 {

	static int maxNestedParenthesis(String s)
	{
		
		int currmax=0,max=0;
		for(int i=0;i<s.length();i++)
		{
			   if(s.charAt(i)=='(')
			   {
				    currmax++;
				    if(currmax>max)
				    	 max=currmax;
			   }
			   else
			   {
				   if(s.charAt(i)==')')
				   {
					   		if(currmax>0)
					   			currmax--;
					   		else
					   			return -1;
				   }
			   }
		}
		// balance check 
		if(currmax!=0)
			    return -1;
		return max;
	}
	
	public static void main(String[] args) 
	{
		   String s="(((ma)(ni)(())))";
		   System.out.println("Max nested parenthesis = "+maxNestedParenthesis(s));
	}
}
