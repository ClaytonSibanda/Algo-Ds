package linkedlist;

/*
 * reverse a list
 * 
 */
public class Problem2 {

	static LinkList reverse(LinkList l)
	{
		// zero or one element 
		 if(l==null || l.getNext()==null)
			    return l;
		 
		 LinkList f=null,s=l,t=l.getNext();
		 
		 for(;s!=null;)
		 {
			 s.setNext(f);
			 f=s;
			 s=t;
			 if(t!=null)
				 t=t.getNext();
		 }
		 return f;
	}
	
	public static void main(String[] args) {
		
//		LinkList l =null;
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));

		 
		
		 for(LinkList l1=reverse(l);l1!=null;l1=l1.getNext())
			  System.out.println(l1.getData());
		}
}
