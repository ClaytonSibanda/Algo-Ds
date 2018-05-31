package linkedlist;

public class Problem20 {
	static boolean search(LinkList l,int key)
	{
		if(l==null)
			 return false;
		if(l.getData()==key)
			  return true;
		return search(l.getNext(),key);
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(4));
		l.getNext().getNext().getNext().setNext(new LinkList(5));
		int key=9;
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		if(search(l,key))
			  System.out.println("Found");
		else
			 System.out.println("Not Found");
	}
}