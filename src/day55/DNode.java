package day55;

public class DNode {

	private DNode prev;
	private int data;
	private DNode next;
	
	
	public DNode(int data)
	{
		this.data=data;
		this.prev=null;
		this.next=null;
	}


	public DNode getPrev() {
		return prev;
	}


	public void setPrev(DNode prev) {
		this.prev = prev;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public DNode getNext() {
		return next;
	}


	public void setNext(DNode next) {
		this.next = next;
	}
	
	
}
