package trees;
// recursive inorder

public class Problem2 {

		static void inorder(Tree t)
		{
			  if(t==null)
				   return;
			  inorder(t.getLeft());
			  System.out.print(t.getData()+" ");
			  inorder(t.getRight());
			  
		}
		public static void main(String[] args) {
			
			Tree t=new Tree(1);
			t.setLeft(new Tree(2));
			t.setRight(new Tree(3));
			t.getLeft().setLeft(new Tree(4));
			t.getLeft().setRight(new Tree(5));
			t.getRight().setLeft(new Tree(6));
			t.getLeft().getRight().setLeft(new Tree(7));
			
			inorder(t);
			
		}

	
}

