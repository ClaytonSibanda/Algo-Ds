package linkedlist;
/*
 * 
 * pair wise swap of the element
 *
 */

public class Problem11 {

	static LinkList pairWiseSwap(LinkList l)
	{
		
		if(l==null||l.getNext() ==null)
			return l;
		
		LinkList f=l;
		LinkList s=null,t=f,rem=null,newstart=l.getNext();
		while(t!=null && t.getNext()!=null)
		{
			 f=t;
			 s=f.getNext();
			 t=s.getNext();
			 
			 
			 //System.out.println(s.getData()+" "+f.getData());
			 s.setNext(f);
			 f.setNext(t);
			 //System.out.println(f.getData()+" "+s.getData());
			 
			 if(rem!=null)
				  rem.setNext(s);
			 rem=f;
		}
		return newstart;
	}
	public static void main(String[] args) {
	
//		LinkList l =null;
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		// l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));

		l=pairWiseSwap(l);
		for(LinkList l1=l;l1!=null;l1=l1.getNext())
		{  
			  System.out.println(l1.getData());
		}
	}
}
