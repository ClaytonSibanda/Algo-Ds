	package trees;
	
	import java.util.LinkedList;
	import java.util.Queue;
	
	// Count the leaf nodes of a tree.
	
	public class Problem10 
	{
		
		    static int leafNodesRecursive(Tree t)
		    {
		    	if(t==null)
		    		 return 0;
		    	if(t.getLeft()==null && t.getRight()==null)
		    		return 1;
		    	return leafNodesRecursive(t.getLeft()) + leafNodesRecursive(t.getRight());
		    }
			static int leafNodes(Tree t)
			{
					int count=0;
					Queue<Tree> q=new LinkedList<Tree>();
					Tree temp = t;
					while(temp!=null)
					{
						if((temp.getLeft()==null && temp.getRight()==null))
							count++;
						if(temp.getLeft()!=null)
							   q.add(temp.getLeft());
						if(temp.getRight()!=null)
							  q.add(temp.getRight());
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
				//		System.out.println("Leaf nodes in the tree = "+ leafNodes(t));
						System.out.println("Leaf nodes in the tree = "+ leafNodesRecursive(t));
			}
}