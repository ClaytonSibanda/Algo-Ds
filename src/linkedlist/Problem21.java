package linkedlist;

public class Problem21 {

	static LinkList deleteList(LinkList l)
	{
		if(l==null)
			 return null;
		
		deleteList(l.getNext());
		l=null;
		return l;
	}
	
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		int key=9;
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		l=deleteList(l);
		System.out.println(l);
	}


}
