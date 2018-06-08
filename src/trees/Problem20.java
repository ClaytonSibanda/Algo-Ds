package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Problem20  {

	static void leftmostRightmost(Tree t)
	{
		if(t==null)
			 return;
		
		boolean first=false;
		boolean one=false;
		int last=-1;
		
		Queue<Tree>q=new LinkedList<Tree>();
		
		q.add(t);
		q.add(null);
		
		while(!q.isEmpty())
		{
			Tree temp=q.poll();
			if(first)
			{
					System.out.println(temp.getData());
					if(temp.getLeft()!=null)
						   q.add(temp.getLeft());
					if(temp.getRight()!=null)
						   q.add(temp.getRight());
					first=false;
					one=true;
			}
			else if(temp==null)
			{
				if(q.size()>=1)
					q.add(null);
				
				first=true;
				if(!one)
					 System.out.println(" "+last);
			}
			else
			{
				last=temp.getData();
				
				one=false;
				if(temp.getLeft()!=null)
					   q.add(temp.getLeft());
				if(temp.getRight()!=null)
					   q.add(temp.getRight());
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

		leftmostRightmost(t);
	}
}
