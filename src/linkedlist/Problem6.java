package linkedlist;

public class Problem6 
{

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
			LinkList temp=f;
			LinkList l1=l;
			while(temp.getNext()!=l1.getNext())
			{
				  l1=l1.getNext();
				  temp=temp.getNext();
			}
			System.out.println("Loop detected in Node = "+(temp.getData()));
			temp.setNext(null);
			for(LinkList l2=l;l2!=null;l2=l2.getNext())
				System.out.println(l2.getData());
			System.out.println("Removed loop");
			return true;
			}
			System.out.println("No Loop Detected");
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
		  
		  loopDetect(l);
	  }
}