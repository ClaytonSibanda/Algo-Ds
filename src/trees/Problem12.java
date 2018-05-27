	
// compare two trees are identical or not
	
	package trees;
	import java.util.LinkedList;
	import java.util.Queue;
	
	
	public class Problem12 
	{		
		    static boolean identicalTreeRec(Tree t1,Tree t2)
		    {
		    		if(t1==null && t2!= null  || t1!=null && t2== null)
		    			  return false;
		    		if(t1==null && t2==null)
		    			 return true;
		    		
		    		if(t1.getData()!=t2.getData())
			    			return false;
		    		return identicalTreeRec(t1.getLeft(),t2.getLeft()) && identicalTreeRec(t1.getRight(),t2.getRight());
		    }
			static boolean identicalTreeIter(Tree t)
			{
				return false;
					
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
						
						Tree t1=new Tree(1);
						t1.setLeft(new Tree(2));
						t1.setRight(new Tree(3));
						t1.getLeft().setLeft(new Tree(4));
						t1.getLeft().setRight(new Tree(5));
						t1.getRight().setLeft(new Tree(6));
						t1.getLeft().getRight().setLeft(new Tree(7));
						
						if(identicalTreeRec(t, t1))
								System.out.println("Trees are identical");
						else
								System.out.println("Trees are not identical");
						//System.out.println("Leaf nodes in the tree = "+ identicalTreeIter(t));
			}
}