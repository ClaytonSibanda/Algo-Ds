
package trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Size of the tree

public class Problem15 
{
		static int SizeTree(Tree t)
		{
				if(t==null)
					return 0;
				int left=SizeTree(t.getLeft());
				int right=SizeTree(t.getRight());
				
				return left + right + 1 ;
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
					System.out.println("size of the tree = "+SizeTree(t));
		}
}

