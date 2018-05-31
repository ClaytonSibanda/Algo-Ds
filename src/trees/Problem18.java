package trees;

public class Problem18 {

	static int countLeafRecursively(Tree t)
	{
		if(t==null)
			 return 0;
		if(t.getLeft()==null && t.getRight()==null)
			 return 1;
		return countLeafRecursively(t.getLeft()) + countLeafRecursively(t.getRight());
	}
	public static void main(String[] args) 
	{			
				Tree t= new Tree(15);
				t.setLeft(new Tree(12));
				t.setRight(new Tree(18));
				t.getLeft().setLeft(new Tree(9));
				t.getLeft().setRight(new Tree(14));
				t.getRight().setLeft(new Tree(17));
				t.getLeft().getRight().setLeft(new Tree(13));
				
				System.out.println("The leaf nodes = "+countLeafRecursively(t));
	}
}
