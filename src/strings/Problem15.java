package strings;

public class Problem15 {

	static boolean checkZeroBetweenOne(String s)
	{
		 int first=s.indexOf('1');
		 int last=s.lastIndexOf('1');
		 System.out.println(first +" "+last); 
		 for(int i=first;i<last;i++)
			  if(s.charAt(i)=='0')
				    return true;
		 
		 return false;
	}
	public static void main(String[] args) {
		
		// 0's should not be present between 1's
		 
		// String s="0101010";  // invalid
		 String s="111100";   // valid
		 
		 if(checkZeroBetweenOne(s))
			 System.out.println("Yes, 0's are present between 1's");
		 else
			 System.out.println("No, 0's are not present between 1's");
	}
}
