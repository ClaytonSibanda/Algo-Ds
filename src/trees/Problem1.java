package trees;
// recursive preorder

public class Problem1 {

	static void preorder(Tree t)
	{
		  if(t==null)
			   return;
		  System.out.print(t.getData()+" ");
		  preorder(t.getLeft());
		  preorder(t.getRight());
		  
	}
	public static void main(String[] args) {
		
		Tree t=new Tree(1);
		t.setLeft(new Tree(2));
		t.setRight(new Tree(3));
		t.getLeft().setLeft(new Tree(4));
		t.getLeft().setRight(new Tree(5));
		t.getRight().setLeft(new Tree(6));
		t.getLeft().getRight().setLeft(new Tree(7));
		
		preorder(t);
		
	}
}
