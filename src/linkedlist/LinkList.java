package linkedlist;

public class LinkList {

	private int data;
	private LinkList next;
	public LinkList(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkList getNext() {
		return next;
	}
	public void setNext(LinkList next) {
		this.next = next;
	}
	
}
