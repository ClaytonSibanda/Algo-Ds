package linkedlist;

class stack extends LinkList
{	
	int capacity;
	int top;
	LinkList l;
	public stack(int c)
	{
		super(0);
		  capacity=c;
		  top=0;
		  l=null;
	}
	boolean isEmpty()
	{
		if(l==null && top==0)
		{   System.out.println("Stack is empty!!");
			return true;
		}
		return false;
	}
	boolean isFull()
	{ 
		if(top==capacity)
		{
			System.out.println("Stack is full!!");
			return true;
		}
		return false; 
	}
	public void push(int data)
	{
		if(!isFull())
		{
			top++;
			LinkList temp=new LinkList(data);
			  temp.setNext(l);
			  l=temp;
		}
	}
	public int pop()
	{
		if(!isEmpty())
		{
	  	  top--;
	  	LinkList temp=l;
			  l=l.getNext();
			  return temp.getData();
		}
		return -1;
	}
	public int peek()
	{
		if(!isEmpty())
		{
			  return l.getData();
		}
		return -1;
	}
}


public class Problem14 {

	  public static void main(String[] args) 
	  {
		  int top;
	  	  stack s =new stack(5);	
	  	  
	     	  top=s.pop();
	  	  System.out.println("removing = "+(top==-1?"List empty":top));
	  	  s.push(3);
	  	  s.push(4);
	  	  s.push(8);
	  	  s.push(7);
	  	  s.push(1);
	
	  	  System.out.println("peek element = "+(s.peek()!=-1?s.peek():"List empty"));
	  	  s.push(8);
	     	  top=s.pop();
	  	  System.out.println("removing = "+(top==-1?"List empty":top));
	     	  top=s.pop();
	  	  System.out.println("removing = "+(top==-1?"List empty":top));
	     	  top=s.pop();
	  	  System.out.println("removing = "+(top==-1?"List empty":top));
	  	  System.out.println("peek element = "+(s.peek()!=-1?s.peek():"List empty"));
	  	  
	}
}
