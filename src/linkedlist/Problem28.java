package linkedlist;

public class Problem28 {
	static LinkList deleteMiddleElement(LinkList l)
	{
		if(l==null)
			return null;

		LinkList l1=l;
		LinkList s=l;
		LinkList f=l;
		LinkList prev=null;
		
		while(s!=null && f!=null && f.getNext()!=null)
		{	 prev=s;
			 s=s.getNext();
			 f=f.getNext().getNext();
			 
		}
		
		LinkList temp=s;
		prev.setNext(temp.getNext());
		temp=null;
		return l;
	
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		//l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
	    l=deleteMiddleElement(l);
	    for(LinkList l1=l;l1!=null;l1=l1.getNext())
	    	  System.out.println(l1.getData());
	}
}
