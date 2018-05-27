package trees;
// Non-Recursive reverse level order traversal
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem8 
{
		static void reverseLevelOrder(Tree t)
		{
				if( t== null)
				{
					System.out.println( "tree is empty");
					return;
				}
				Queue<Tree> q=new LinkedList<Tree>();
				Stack<Tree> s=new Stack<Tree>();
				Tree temp = t;
				while(temp!=null)
				{
					 s.push(temp);
					 if(temp.getLeft()!=null)
						   q.add(temp.getLeft());
					 if(temp.getRight()!=null)
						  q.add(temp.getRight());
					 temp=q.poll();
				}
				
				while(!s.isEmpty())
				{
					 System.out.println(s.pop().getData());
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
					reverseLevelOrder(t);
		}
}
