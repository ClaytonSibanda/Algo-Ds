package linkedlist;

public class Problem10 
{
	static boolean checkCircular(LinkList l)
	{
		if(l==null)
			  return false;
		
		LinkList l1=l.getNext();
		while(l!=l1 && l1!=null)
		{
			l1=l1.getNext();
			
		}
		if(l==l1)
			   return true;
		return false;
	}
	public static void main(String[] args) {
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		l.getNext().getNext().getNext().getNext().setNext(l);
		
		System.out.println("Is list circular = "+checkCircular(l));
		
	}
	
}
