package linkedlist;

public class Problem22 {

	static int middleElement(LinkList l)
	{	
		if(l==null)
			return -1;
		
		LinkList s=l;
		LinkList f=l;
		
		while(s!=null && f!=null && f.getNext()!=null)
		{
			 s=s.getNext();
			 f=f.getNext().getNext();
		}
		return s.getData(); 
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		
		System.out.println("Middle element of the list :- "+middleElement(l));
	}
}
