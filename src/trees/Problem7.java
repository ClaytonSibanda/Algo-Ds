package trees;
// Non-Recursive post order traversal

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem7 
{
		static void postorder(Tree t)
		{
				if(t==null)
				{
					System.out.println("Tree is empty");
					return; 
				}
				Stack<Tree> s1=new Stack<Tree>();
				Stack<Tree> s2=new Stack<Tree>();
				
				s1.push(t);
				Tree temp=null;
				while(!s1.isEmpty())
				{
						temp=s1.pop();
						s2.push(temp);
						
						if(temp.getLeft()!=null)
									s1.push(temp.getLeft());
						if(temp.getRight()!=null)
									s1.push(temp.getRight());
				}
				
				while(!s2.isEmpty())
				{
					 System.out.println(s2.pop().getData());
				}
		}
		public static void main(String[] args) 
		{			
					Tree t=new Tree(1);
					t.setLeft(new Tree(2));
					t.setRight(new Tree(3));
					t.getLeft().setLeft(new Tree(4));
					t.getLeft().setRight(new Tree(5));
					t.getRight().setLeft(new Tree(6));
					t.getLeft().getRight().setLeft(new Tree(7));
					postorder(t);
		}
}
