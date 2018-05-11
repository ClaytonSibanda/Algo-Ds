package linkedlist;

/*
 * find the middle element of the link list.
 */


public class Problem1 {

	static LinkList midElement(LinkList l)
	{
		
		LinkList s=l,f=l;
		
		if(l==null)
			 return null;
		
		for(;f!=null && f.getNext()!=null;s=s.getNext(),f=f.getNext().getNext());
		return s;
	}
	public static void main(String[] args) {
	
//		LinkList l =null;
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));

		LinkList mid=midElement(l);
		System.out.println((mid!=null?("middle element = "+mid.getData()):"List is null"));
	}
}
