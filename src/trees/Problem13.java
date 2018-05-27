package trees;
// height of tree

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem13 
{
		static int heightTree(Tree t)
		{
				if(t==null)
					return 0;
				int left=heightTree(t.getLeft());
				int right=heightTree(t.getRight());
				
				if(left>=right)
					  return left + 1 ;
				return right + 1 ;
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
					System.out.println("Height of the tree = "+heightTree(t));
		}
}
