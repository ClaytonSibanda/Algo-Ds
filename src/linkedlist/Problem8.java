package linkedlist;

public class Problem8 extends Problem2
{
	static int addOneUtil(LinkList l)
	{
		   if(l==null)
			    return 1;
		   
		   int res = l.getData() + addOneUtil(l.getNext());
		   int carry= (res>=10)?1:0;
		   res%=10;
		   l.setData(res);
		   return carry;
	}
	static LinkList addOne(LinkList l)
	{
		if(l==null)
			return null;
		int carry=addOneUtil(l);
		if(carry>0)
		{
			LinkList l1=new LinkList(carry);
			l1.setNext(l);
			return l1;
		}
		return l;
	}
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(9);
		l.setNext(new LinkList(8));
		l.getNext().setNext(new LinkList(1));
		l.getNext().getNext().setNext(new LinkList(9));
		l=reverse(l);
		l=addOne(l);
		l=reverse(l);
		printList(l);
	}
}
