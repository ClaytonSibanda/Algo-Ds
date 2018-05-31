package strings;

public class Problem16 {

	static void convertToN(String s,int n)
	{
		 if(n<=0)
		 {
			 System.out.println("Not valid N");
			 return;
		 }
		    for(int i=0;i<s.length();i++)
		    {
		    	 if(i%n==0 && i>0)
		    	 {
		    		System.out.println();
		    	 }
		    	 System.out.print(s.charAt(i));
		    }
	}
	static void convertToNwithoutspaces(String s,int n)
	{
		 if(n<=0)
		 {
			 System.out.println("Not valid N");
			 return;
		 }
	     for(int i=0,count=0;i<s.length();i++)
	     {
	    	  if(s.charAt(i)!=' ')
	    	  {     
	    		   System.out.print(s.charAt(i));
	    		   count++;
	    		   if(count==n)
	    		   {
	    			   System.out.println();
	    			   count=0;
	    		   }
		      } 	    
	     }
	}
	public static void main(String[] args) 
	{
		// spaces are not removed  in first function.
		// spaces are removed in second function.
		  String s="Java Language is developed by james gosling";	
		  int n=5;
		  //convertToN(s,n);
		  convertToNwithoutspaces(s,n);
	}	
}
