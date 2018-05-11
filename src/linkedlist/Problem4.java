package linkedlist;

/*
 * reverse every k nodes of a list 
 * 
 */
public class Problem4 {
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
	static LinkList reverseEveryKNodes(LinkList l,int k)
	{
		LinkList newstart=l;
		LinkList p1=l,p2=l,temp=null;
		for(int count=1;p2!=null;count++,p2=p2.getNext())
		{
			if(count<=k || p2.getNext()!=null)
			{
			      temp=p2.getNext();
					
					 if(newstart==null)
					 {
						      p2.setNext(null);
						      newstart=reverse(p1);
						      p1.setNext(temp);
						      p2=temp;
					 }
					 else
					 {
						 	 
					 }
						    
			}
		}
		return null;
	}
	public static void main(String[] args) {
		
//		LinkList l =null;
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));

		 int k=3,n=0;
		 for(LinkList l1=l;l1!=null;l1=l1.getNext(),n++);
		 
		 LinkList rtlst =null;
		 if(k>n)
		 {
			 System.out.println("Not possible");	
		 }
		 else if(k==n)
		 {
			 	 rtlst=l;
		 }
		 else
		 {
			  rtlst=reverseEveryKNodes(l,k);
		 }
	}
}