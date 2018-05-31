package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Problem19 {

	static void avgLevel(Tree t)
	{
			if(t==null)
				 return;
		
			Queue<Tree> q=new LinkedList<Tree>();
			q.add(t);
			q.add(null);
			//q.offer(null);
			int sum =0;
			int count=0;
			while(!q.isEmpty())
			{
				//  System.out.println("hi");
				  Tree temp=q.poll();
				  if(temp==null)
				  {
					  if(sum>0)
				    	 System.out.println((sum/count) +" ");
					
					  count=0;
					  sum=0;
					  if(!q.isEmpty())
						  q.offer(null);
				  }
				  else
				  {
						 count++;
						 sum+=temp.getData();
						 if(temp.getLeft()!=null)
						     q.add(temp.getLeft());
						 if(temp.getRight()!=null)
						     q.add(temp.getRight());
						 
			//			 System.out.println(temp.getData());
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
				t.getLeft().getRight().setLeft(new Tree(7));
				avgLevel(t);
	}
}
