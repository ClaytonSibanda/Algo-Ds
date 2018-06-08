package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Problem21 extends Problem4
{

	static Tree mirror(Tree t) 
	{
		   	if(t==null)
		   		 return t;
		   	
		   	mirror(t.getLeft());
		   	mirror(t.getRight());
		   	
		   	Tree temp=t.getLeft();
		   	t.setLeft(t.getRight());
		   	t.setRight(temp);
		   	return t;
	}
	public static void main(String[] args) {
		
		Tree t= new Tree(1);
		t.setLeft(new Tree(2));
		t.setRight(new Tree(3));
		t.getLeft().setLeft(new Tree(4));
		t.getLeft().setRight(new Tree(5));
		t.getRight().setLeft(new Tree(6));
		t.getLeft().getRight().setLeft(new Tree(7));
		
		Tree mirrorTree = mirror(t);
		levelorder(mirrorTree);
	}
}
