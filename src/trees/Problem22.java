package trees;

import java.util.Stack;

public class Problem22 extends Problem4
{

	static void levelorderspiralform(Tree t) 
	{

			if(t==null)
				return;
			
			Stack<Tree> s1=new Stack<Tree>();
			Stack<Tree> s2=new Stack<Tree>();
			
			s1.push(t);
			while(!s1.isEmpty() || !s2.isEmpty())
			{
				   while(!s1.empty())
				   {
					   Tree temp=s1.pop();
					   System.out.println(temp.getData());
					   if(temp.getLeft()!=null)
						     s2.push(temp.getLeft());
					   if(temp.getRight()!=null)
						    s2.push(temp.getRight());
				   }
				   while(!s2.empty())
				   {
					   Tree temp=s2.pop();
					   System.out.println(temp.getData());
					   if(temp.getRight()!=null)
						    s1.push(temp.getRight());
					   if(temp.getLeft()!=null)
						    s1.push(temp.getLeft());
				   }
			}
	}
	public static void main(String[] args) {
		
		Tree t= new Tree(1);
		t.setLeft(new Tree(2));
		t.setRight(new Tree(3));
		t.getLeft().setLeft(new Tree(4));
		t.getLeft().setRight(new Tree(5));
		t.getRight().setLeft(new Tree(6));
		t.getLeft().getRight().setLeft(new Tree(7));
		levelorderspiralform(t);
	}
}
