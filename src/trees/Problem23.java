package trees;

public class Problem23 
{
		static void sum(Tree t,int s)
		{
		      s+=t.getData();
			   if(t.getLeft()==null && t.getRight()==null)
			   {
				   System.out.println(s);
				   return;
			   }
			  if(t.getLeft()!=null) 
				  sum(t.getLeft(),s);
			  if(t.getRight()!=null)
			     sum(t.getRight(),s);
		}
		static void sumRootToLeaf(Tree t)
		{
			 if(t==null)
				  return;
			 
			 sum(t,0);
						  
		}
		public static void main(String[] args) {
			
			Tree t= new Tree(1);
			t.setLeft(new Tree(2));
			t.setRight(new Tree(3));
			t.getLeft().setLeft(new Tree(4));
			t.getLeft().setRight(new Tree(5));
			t.getRight().setLeft(new Tree(6));
			t.getRight().setRight(new Tree(7));
			t.getRight().getRight().setRight(new Tree(7));

			sumRootToLeaf(t);
		}
}
