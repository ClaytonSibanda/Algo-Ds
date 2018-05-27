package trees;

// Lowest common ansector in a tree.

public class Problem16 
{
		static Tree lca(Tree t,int n1,int n2)
		{Tree temp =t,prev=null;
			while(temp!=null)
			{   prev=temp;
				if(temp.getData() > n1 && temp.getData() > n2)
					temp=temp.getLeft();
				else if (temp.getData()<n1 && temp.getData() <n2)
					  temp=temp.getRight();
				else
					break;
				
			}
			return prev;
		}
		static Tree lcarec(Tree t,int n1,int n2)
		{
			if(t==null)
				return null;
			
			if(t.getData() > n1 && t.getData() > n2)
				  return lca(t.getLeft(),n1,n2);
			else if (t.getData()<n1 && t.getData() <n2)
				  return lca(t.getRight(),n1,n2);
			else
				 return t;
		}
		public static void main(String[] args) 
		{			
			
			// assuming it is a BST and given nodes are present in the tree.
					Tree t= new Tree(15);
					t.setLeft(new Tree(12));
					t.setRight(new Tree(18));
					t.getLeft().setLeft(new Tree(9));
					t.getLeft().setRight(new Tree(14));
					t.getRight().setLeft(new Tree(17));
					t.getLeft().getRight().setLeft(new Tree(13));

			// extends program by checking the code that elements are present in the tree.
					
					System.out.println("Lowest common ansecotr = "+lca(t,100,100).getData());
			//		System.out.println(" Lowest common ansector = "+lcarec(t,12,24).getData());
					
		}
}