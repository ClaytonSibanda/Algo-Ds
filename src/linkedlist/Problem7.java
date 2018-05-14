package linkedlist;
/*
 * 
 * nth node from the end
 */
public class Problem7 {

	static LinkList nthNodeFromEnd(LinkList l,int n)
	{
		LinkList nth=null;
		LinkList run=l;
		
		for(int count=1;run!=null;run=run.getNext(),count++)
		{
			  if(count>n)
			  {
				  if(nth!=null)
					   nth=nth.getNext();
				  else
				       nth=l;
			  }
		}
		return nth;
	}
	public static void main(String[] args) {
	
//		LinkList l =null;
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));

		LinkList nth=nthNodeFromEnd(l,3);
		System.out.println((nth!=null?("Nth node from end  = "+nth.getData()):"List is null"));
	}
}
