package linkedlist;

public class Problem24 {

	static int smallest(LinkList l)
	{
		
		   int s=Integer.MAX_VALUE;
		   while(l!=null)
		   {
			   if(s>l.getData())
				   s=l.getData();
			   
			   l=l.getNext();
		   }
		return s;
	}
	static int largest(LinkList l)
	{
		int la=Integer.MIN_VALUE;
		   while(l!=null)
		   {
			   if(la<l.getData())
				   la=l.getData();
			   
			   l=l.getNext();
		   }
		return la;
	}
	public static void main(String[] args) {
		
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
	
		int small=smallest(l);
		int large=largest(l);
		
		System.out.println("Smallest element in the list = "+small);
		System.out.println("Largest element in the list = "+large);
	
	}
}
