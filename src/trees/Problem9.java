	package trees;
	
	import java.util.LinkedList;
	import java.util.Queue;
	
	// Count the half nodes of a tree.
	
	public class Problem9 
	{
		
		    static int halfNodesRecursive(Tree t)
		    {
		    	if(t.getLeft()==null && t.getRight()==null)
		    		 return 0;
		    	else if((t.getLeft()!=null && t.getRight()==null))
		    		return halfNodesRecursive(t.getLeft()) + 1;
		    	else if((t.getRight()!=null && t.getLeft()==null))
					return halfNodesRecursive(t.getLeft()) + 1;
				else 
					return halfNodesRecursive(t.getLeft()) + halfNodesRecursive(t.getRight());
		    }
			static int halfNodes(Tree t)
			{
					int count=0;
					Queue<Tree> q=new LinkedList<Tree>();
					Tree temp = t;
					while(temp!=null)
					{
						if((temp.getLeft()!=null && temp.getRight()==null)||(temp.getRight()!=null && temp.getLeft()==null))
						{
							count++;
						}
						if(temp.getLeft()!=null)
							   q.add(temp.getLeft());
						 if(temp.getRight()!=null)
							  q.add(temp.getRight());
					//	 System.out.println(temp.getData());
						 temp=q.poll();
					}
					return count;
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
					//	System.out.println("Half nodes in the tree = "+ halfNodes(t));
						System.out.println("Half nodes in the tree = "+ halfNodesRecursive(t));
			}
	}
