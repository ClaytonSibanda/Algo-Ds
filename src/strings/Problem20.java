package strings;

public class Problem20 {

	static void  aplhabetPosCheck(String s)
	{
			int small=97;
			int big=65;
			
			int n=s.length();
			for(int i=0,j=0;j<n;i++,j++)
			{
				  if(i==26)
					   i%=26;
				  if(s.charAt(j)==(small+i) || s.charAt(j)==(big+i))
					      System.out.println(s.charAt(j)+" "+(j+1));
			}
	}
	public static void main(String[] args) 
	{
		   String s="accdefffikllsdfhbgurgalsrgbalvriubvjkabuebvnjbaeuiqrbgihqe";   
		   aplhabetPosCheck(s);
	}
	
}
