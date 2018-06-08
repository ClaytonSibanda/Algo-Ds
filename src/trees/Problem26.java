package trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

class Node 
{
	int data;
	int hd;
	Node left,right;
	public Node(int data)
	{
		  this.data=data;
		  this.hd=Integer.MAX_VALUE;
		  left=null;
		  right=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
public class Problem26 {

	static void bottonview(Node t)
	{
		if(t==null)
			 return;
		Queue <Node> q=new LinkedList<Node>();
		q.add(t);
		t.setHd(0);
		Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
		
		while(!q.isEmpty())
		{
			 Node n=q.poll();
			 int hd=n.getHd();
			// if(m.get(hd)==null)
				 m.put(hd, n.getData());
			 
			 if(n.getLeft()!=null)
			 {	n.getLeft().setHd(hd-1);
				 q.add(n.getLeft());
				 
			 }
			 if(n.getRight()!=null)
			 {	 
				 n.getRight().setHd(hd+1);
				 q.add(n.getRight());
			 }
		}
		for(Integer i:m.values())
		{
			 System.out.print(i.intValue()+" ");
		}
	}

	static void topview(Node t)
	{
		if(t==null)
			 return;
		Queue <Node> q=new LinkedList<Node>();
		q.add(t);
		t.setHd(0);
		Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
		
		while(!q.isEmpty())
		{
			 Node n=q.poll();
			 int hd=n.getHd();
			 if(m.get(hd)==null)
				 m.put(hd, n.getData());
			 
			 if(n.getLeft()!=null)
			 {	n.getLeft().setHd(hd-1);
				 q.add(n.getLeft());
				 
			 }
			 if(n.getRight()!=null)
			 {	 
				 n.getRight().setHd(hd+1);
				 q.add(n.getRight());
			 }
		}
		for(Integer i:m.values())
		{
			 System.out.print(i.intValue()+" ");
		}
	}

	public static void main(String[] args) {
		
		Node t= new Node(1);
		t.setLeft(new Node(2));
		t.setRight(new Node(3));
		t.getLeft().setLeft(new Node(4));
		t.getLeft().setRight(new Node(5));
		t.getRight().setLeft(new Node(6));
		t.getRight().setRight(new Node(7));
		t.getRight().getLeft().setRight(new Node(8));
		System.out.println("Bottom view ");
		bottonview(t);
		
		System.out.println("\nTop view");
		topview(t);
		
	}
}
