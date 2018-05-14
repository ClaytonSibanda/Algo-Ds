package linkedlist;

/*
 * 
 * Add the numbers in a linked list 
 * 
 */
public class Problem12 {

	static LinkList addTwoNumber(LinkList l,LinkList l1)
	{
		int carry=0;
		LinkList temp =null,sumList=null;
		while(l!=null || l1!=null || carry!=0)
		{
			 int sum=0;
			 if(l!=null)
			 {
				 sum+=l.getData();
				 l=l.getNext();
			 }
			 if(l1!=null)
			 {
				 sum+=l1.getData();
				 l1=l1.getNext();
			 }
			 sum+=carry;
			 if(temp!=null)
			 {	   temp.setNext(new LinkList(sum%10));
			 temp=temp.getNext();
			 }
			 else
			 {	   
				 temp=new LinkList(sum%10);
				 sumList=temp;
			 }
			 
			 carry=sum/10;
		}
		return sumList;
	}
	
	public static void main(String[] args) 
	{
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		
		LinkList l1=new LinkList(5);
		l1.setNext(new LinkList(7));
		l1.getNext().setNext(new LinkList(9));
		l1.getNext().getNext().setNext(new LinkList(9));
		
		LinkList sum=addTwoNumber(l,l1);
		String s="";
		for(LinkList t=sum;t!=null;t=t.getNext())
				s=t.getData()+s;
	System.out.println(s);
	}
}
