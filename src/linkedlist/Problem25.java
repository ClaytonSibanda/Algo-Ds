package linkedlist;

public class Problem25 {

	static LinkList removeDupFromSorted(LinkList l)
	{
		LinkList l1=l;
		LinkList l2=null;
		while(l1!=null && l1.getNext()!=null) 
		{
			if(l1.getData()==l1.getNext().getData())
			{	
				LinkList temp=l1.getNext().getNext();
				LinkList temp1=l1.getNext();
				l1.setNext(temp);
				temp1=null;
			}
			else
				l1=l1.getNext();
		}
		return l;
	}
	public static void main(String[] args) {
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(2));
		l.getNext().getNext().setNext(new LinkList(3));
		l.getNext().getNext().getNext().setNext(new LinkList(3));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(3));
	
		l=removeDupFromSorted(l);
		
		for(LinkList l1=l;l1!=null;l1=l1.getNext())
			  System.out.println(l1.getData());
	}
}
