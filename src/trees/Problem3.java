package trees;
// recursive postorder

public class Problem3 
{
	static void postorder(Tree t)
	{
				  if(t==null)
					   return;
				  postorder(t.getLeft());
				  postorder(t.getRight());
				  System.out.print(t.getData()+" ");
					  
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
				
				postorder(t);
				
	}
}
