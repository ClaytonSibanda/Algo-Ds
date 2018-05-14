package linkedlist;

public class Problem5 {
	/*
	 * 1->2->3->4->5->2
	 * 
	 */
	static boolean loopDetect(LinkList l)
	{
		if(l==null || l.getNext()==null)
				return false;
		boolean check=false;
		LinkList s=l,f=l;
		do
		{
			 s=s.getNext();
			 f=f.getNext().getNext();
		}while(s!=f && f!=null && f.getNext()!=null);
		if(s==f)
		{	 check=true;
		     return true;
		}
		return false;
	}
	
  public static void main(String[] args) 
  {
	  LinkList l=new LinkList(1);
	  l.setNext(new LinkList(2));
	  l.getNext().setNext(new LinkList(3));
	  l.getNext().getNext().setNext(new LinkList(4));
	  l.getNext().getNext().getNext().setNext(new LinkList(5));
	  l.getNext().getNext().getNext().getNext().setNext(l.getNext().getNext());
	  
	  if(loopDetect(l))
		 System.out.println("Loop Detected ");
	  else
		  System.out.println("Loop Not detected");
  }
}