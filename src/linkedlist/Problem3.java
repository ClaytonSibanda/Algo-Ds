package linkedlist;

/*
 * rotate a list by k nodes  [k sjhould be less than or equal to length of list]
 */

public class Problem3 {

	static LinkList rotate(LinkList l,int k)
		{
			if(l==null || l.getNext()==null)
				    return l;
			 
			 LinkList sr=l,er=l,run=l.getNext();
			
			 for(int count=1;run.getNext()!=null;run=run.getNext(),count++)
			 {
				 	if(count<k)
				 	{
				 		   er=er.getNext();
				 	}
			 }
		
			 LinkList rt =er.getNext();
			 er.setNext(null);
			 run.setNext(sr);
			return rt;
			 
		}
		
		public static void main(String[] args) {
			
//			LinkList l =null;
			
			LinkList l=new LinkList(1);
			l.setNext(new LinkList(2));
			l.getNext().setNext(new LinkList(3));
			l.getNext().getNext().setNext(new LinkList(4));
			l.getNext().getNext().getNext().setNext(new LinkList(5));
			l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
			int n=0,k=6;
			LinkList rt=null;
			for(LinkList l1=l;l1!=null;l1=l1.getNext(),n++);
			
			if(k==n)
				 rt=l;
			else if(k<n)
				 rt=rotate(l, k);
			
			if(rt==null)
				   System.out.println("List is null");
			else
			 for(LinkList rt1=rt;rt1!=null;rt1=rt1.getNext())
				  System.out.println(rt1.getData());
			}
	}
