package trees;

import java.util.LinkedList;
import java.util.Queue;
import trees.Problem1;
// Deletes nodes of a tree non recursively.

public class Problem17 
{
	static void preorder(Tree t)
	{
		  if(t==null)
			   return;
		  System.out.print(t.getData()+" ");
		  preorder(t.getLeft());
		  preorder(t.getRight());
		  
	}	
		static void deleteNonrec(Tree t)
		{
			  if(t==null)
				    return;
			  Queue<Tree> q=new LinkedList<Tree>();
			  Tree temp=t;
			  while(t!=null)
			  {
				  temp=q.poll();
				  if(temp.getLeft()!=null)
					    q.add(temp.getLeft());
				  if(temp.getRight()!=null)
					    q.add(temp.getRight());
				  
				  temp=null;
			  }
		}
	
		public static void main(String[] args) 
		{			
					Tree t= new Tree(15);
					t.setLeft(new Tree(12));
					t.setRight(new Tree(18));
					t.getLeft().setLeft(new Tree(9));
					t.getLeft().setRight(new Tree(14));
					t.getRight().setLeft(new Tree(17));
					t.getLeft().getRight().setLeft(new Tree(13));
					deleteNonrec(t);
					preorder(t);
		}
}