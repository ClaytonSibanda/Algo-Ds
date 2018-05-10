package strings;

import java.util.Stack;

/*
 *Parenthesis checker 
 * 
 */
public class Problem1 {

	public static void main(String[] args) 
	{
		
		Stack<Character> s= new Stack<Character>();
		
		String str="[()][(()][]{{]}}";
		
		for(int i=0;i<str.length();i++)
		{
			   if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(')
			   {   s.push(str.charAt(i));
			   //System.out.println(s.peek());
			   }
			   else
			   {
				   if(str.charAt(i)==')' && s.peek()=='(')
					     s.pop();
				   else if (str.charAt(i)=='}' && s.peek()=='{')
					    s.pop();
				   else if(str.charAt(i)==']' && s.peek()=='[')
					   s.pop();
				   else
					    break;
			   }
			  
		}
					   
		if(s.isEmpty())
			   System.out.println(" String is ordered");
		else
			   System.out.println(" String is not ordered");
	}
		
}

