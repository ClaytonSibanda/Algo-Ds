package linkedlist;


// return -1 if n is null, else it will return

public class Problem18 
{
	static LinkList nthNodeofList(LinkList l,int count,int n)
	{
		  if(l==null)
			   return null;
		  
		  if(count == n)
			   return l;
		 
		  return nthNodeofList(l.getNext(),count+1,n);
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(2));
		l.getNext().getNext().getNext().setNext(new LinkList(1));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		
		int n=0;
		int count=1;
		if(nthNodeofList(l, count, n)!=null)
		{
			System.out.println("Nth node from the linked list = "+(nthNodeofList(l, count, n).getData()));	
		}
		else
		{
			System.out.println("Nth node from the linked list is noth present  ");
		}
	}
}
