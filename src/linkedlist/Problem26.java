package linkedlist;


public class Problem26 
{
	static String evenorodd(LinkList l)
	{
		int count=0;
		if(l==null)
			  return "empty";
		
		while(l!=null) 
		{
			count++;
			l=l.getNext();
		}
		return (count%2==0?"even":"odd");
	}
	public static void main(String[] args) {
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(2));
		l.getNext().getNext().setNext(new LinkList(3));
		l.getNext().getNext().getNext().setNext(new LinkList(3));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(3));
	    System.out.println("List is "+evenorodd(l));
	}
	
}
