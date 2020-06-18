package Stack;

public class ListNode {

	public ListNode next;
	public int data;

	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}

	public ListNode() {
		this.next = null;
		this.data = Integer.MIN_VALUE;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode node) {
		this.next = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String toString() {
		return Integer.toString(data);
	}

}
