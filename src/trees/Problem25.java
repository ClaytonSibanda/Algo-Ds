package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Problem25 {

	static  void leftview(Tree t)
	{
		  if(t==null)
		  	return;
		  
		  Queue<Tree> q=new LinkedList<Tree>();
		  q.add(t);
		  q.add(null);
		  int last=-1;
		  while(!q.isEmpty())
		  { 
			    Tree temp=q.poll();
			  if(temp==null)
			  {
				  if(q.size()>=1)
					    q.add(null);
				  System.out.println(last);
			  }
			  else
			  {
			    if(temp.getRight()!=null)
			    	q.add(temp.getRight());
			    if(temp.getLeft()!=null)
			    	q.add(temp.getLeft());
			   
			    last=temp.getData();
			  } 
		  }
	}
	public static void main(String[] args) 
	{
		Tree t= new Tree(1);
		t.setLeft(new Tree(2));
		t.setRight(new Tree(3));
		t.getLeft().setLeft(new Tree(4));
		t.getLeft().setRight(new Tree(5));
		t.getRight().setLeft(new Tree(6));
		t.getRight().setRight(new Tree(7));
		t.getRight().getLeft().setRight(new Tree(8));

		leftview(t);
	}
}
