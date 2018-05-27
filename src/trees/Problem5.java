package trees;
// Non-Recursive post order traversal

import java.util.Stack;

public class Problem5 
{
		static void preordernonrec(Tree t)
		{
				if(t==null)
				{
					System.out.println("Tree is empty");
					return;
				}
				Stack <Tree> s=new Stack<Tree>();
				Tree temp=t;
				while(true)
				{
					 while(temp!=null)
					 {
						 s.push(temp);
						 System.out.print(temp.getData()+" ");						
						 temp=temp.getLeft();
					 }
					 if(s.isEmpty())
						  break;
					 temp=s.pop();
					 temp=temp.getRight();
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
					preordernonrec(t);
		}
}
