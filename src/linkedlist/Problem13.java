package linkedlist;

/*
 *
 * check palindrome
 * 
 */
public class Problem13 {

	static boolean palindrome(LinkList f)
	{
		for(LinkList l1=f,l2=f;l2!=null;l1=l1.getNext())
		{
			      
		}
		return true;
		
	}
		public static void main(String[] args) {
		
//			LinkList l =null;
			
			LinkList l=new LinkList(1);
			l.setNext(new LinkList(2));
			l.getNext().setNext(new LinkList(3));
			l.getNext().getNext().setNext(new LinkList(2));
			l.getNext().getNext().getNext().setNext(new LinkList(1));
			// l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));

			//System.out.println("IS list palindrome = "+(palindrome(l,l)==true?"Yes":"No"));
		}
	

}
