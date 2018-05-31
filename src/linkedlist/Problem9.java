package linkedlist;

public class Problem9 extends Problem2
{
	static LinkList deleteMnodesAfterNnodes(LinkList l,int m,int n)
	{
		if(l==null)
		{
			System.out.println("List is empty");
			return l;
		}

		int count=0;
		LinkList l1=l;

		while(count<n)
		{
			 l1=l1.getNext();
			 count++;
		}

		if(count==n)
		{
			count=0;
			LinkList prev=l1;
			LinkList temp=null;
			l1=l1.getNext();
			while(l1!=null && count<m)
			{
				 temp=l1.getNext();
				 count++;
				 l1=null;
				 l1=temp;
			}
			if(count==m)
				System.out.println("Deleted m nodes ");
			else
				System.out.println("Node insufficent to perform delete operation");
			
			prev.setNext(temp);
		}
		return l;
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		
		int m=2;  // deletable nodes
		int n=2;  // to be delete
		
		l=deleteMnodesAfterNnodes(l,m,n);
		printList(l);
	}
}
