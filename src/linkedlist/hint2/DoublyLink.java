package linkedlist.hint2;

public class DoublyLink {
	private int data;
	protected DoublyLink prev;
	protected DoublyLink next;
	
	public DoublyLink(int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyLink getPrev() {
		return prev;
	}
	public void setPrev(DoublyLink prev) {
		this.prev = prev;
	}
	public DoublyLink getNext() {
		return next;
	}
	public void setNext(DoublyLink next) {
		this.next = next;
	}
}
