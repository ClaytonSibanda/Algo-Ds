package linkedlist;



class queue 
{	
	int capacity;
	int front;
	int rear;
	LinkList l;
	public queue(int c)
	{
		  capacity=c;
		  front=-1;
		  rear=-1;
		  l=null;
	}
	boolean isEmpty()
	{
		if(front-1==rear || front==-1)
		{    
			System.out.println("Queue is empty!!");
			front=rear=-1;
			return true;
		}
		return false;
	}
	boolean isFull()
	{ 
		if((rear-front)==capacity)
		{
			System.out.println("Queue is full!!");
			return true;
		}
		return false; 
	}
	public void add(int data)
	{
		if(!isFull())
		{
			  if(front==-1)
			  {   
				  front++;
			  	  rear++;
			  }
			  else
				  rear++;
			  
			  LinkList temp=new LinkList(data);
			  temp.setNext(l);
			  l=temp;
		}
	}
	public int remove()
	{
		if(!isEmpty())
		{
		  	  front++;
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

public class problem15 {
	
  public static void main(String[] args) 
  {
	  int top;
  	  queue q=new queue(5);
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  q.add(3);
  	  q.add(4);
  	  q.add(9);
  	  q.add(7);
  	  q.add(1); 	  
  	  q.add(8);
  	  q.add(4);
  	  System.out.println("peek element = "+(q.peek()!=-1?q.peek():"List empty"));
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  System.out.println("peek element = "+(q.peek()!=-1?q.peek():"List empty"));
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  top=q.remove();
  	  System.out.println("removing = "+(top==-1?"List empty":top));
  	  System.out.println("peek element = "+(q.peek()!=-1?q.peek():"List empty"));
  	  
  }
}