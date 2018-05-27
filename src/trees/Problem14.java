
package trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//search x in the tree

public class Problem14 
{
		static boolean search(Tree t,int key)
		{
			if(t==null)
				return false;
			if(t.getData()==key)
				return true;
			return search(t.getLeft(),key) || search(t.getRight(), key);
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
					
					int key=9;
					System.out.println("size of the tree = "+search(t,key));
		}
}

