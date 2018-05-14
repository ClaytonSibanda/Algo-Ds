package linkedlist;
/* delete without head pointer 
 * assumpotion that it is not last node
 */
public class Problem17 {

	static void deleteLastNode(LinkList l)
	{
		if(l==null || l.getNext()==null)
		{ 
			System.out.println("Delete operation not possible");
			return;
		}
		LinkList temp=l;
		int deleteEle=l.getData();
		while(temp.getNext().getNext()!=null)
		{
			temp.setData(temp.getNext().getData());
			temp=temp.getNext();
		}
		temp.setData(temp.getNext().getData());
		System.out.println(temp.getNext().getData());
		temp.setNext(null);

		System.out.println("Element "+deleteEle +" is deleted");
	}
	public static void main(String[] args) {
		
		LinkList l=new LinkList(1);
		  l.setNext(new LinkList(2));
		  l.getNext().setNext(new LinkList(3));
		  l.getNext().getNext().setNext(new LinkList(4));
		  l.getNext().getNext().getNext().setNext(new LinkList(5));
		  l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		  
		  deleteLastNode(l.getNext().getNext());
		  
		  for(LinkList l1=l;l1!=null;l1=l1.getNext())
			  System.out.println(l1.getData());
	}
}
