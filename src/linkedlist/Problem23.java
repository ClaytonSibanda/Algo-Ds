package linkedlist;

public class Problem23 {

	static int countNumbersInList(LinkList l,int key)
	{
		 if(l==null)
			  return 0;
		 int count=0;
		 LinkList l1=l;
		 while(l1!=null)
		 {
		    if(l1.getData()==key)
		    	 count++;
			 l1=l1.getNext();
		 }
		 return count;
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		int key=5;
		System.out.println("The count no of given numbers of the list = "+countNumbersInList(l,key));	  
	}
	
}
