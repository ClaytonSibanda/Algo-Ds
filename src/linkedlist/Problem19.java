package linkedlist;

public class Problem19 
{
	static void reversePrint(LinkList l1)
	{
		  if(l1==null)
			    return;
		  
		  reversePrint(l1.getNext());
		  System.out.println(l1.getData()+" ");
	}
	public static void main(String[] args) 
	{	
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		reversePrint(l);
	}
}
