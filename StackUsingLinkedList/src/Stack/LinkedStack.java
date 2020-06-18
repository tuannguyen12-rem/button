package Stack;

import java.util.EmptyStackException;

import java.util.NoSuchElementException;

public class LinkedStack {

	private int length;
	private ListNode top;

	public LinkedStack() {
		this.length = 0;
		this.top = null;
	}

	public void push(int data) {
		ListNode newNode = new ListNode(data);
		if(top == null) {
			top = newNode;
		}else {
		newNode.setNext(top);
		//newNode.next = top;
		top = newNode;
		length++;
		}
	}
	
	public int pop() throws EmptyStackException {
		if(isEmpty()) throw new EmptyStackException();
        
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	
	public int pop2() {
		if(length ==0) throw new NoSuchElementException("Stack empty!");
		int result = top.data;
		ListNode newTop = top.next;
		top = newTop;
		length--;
		return result;
	}

	public int peek() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();

		return top.getData();
	}

	public boolean isEmpty() {
		return (length == 0);
	}

	public int size() {
		ListNode temp = top;
		int counter = 0;
		while (temp != null) {
			temp = temp.next;
			counter++;
		}
		return counter;
	}

	public String toString() {
		String result = " ";
		ListNode current = top;
		while (current != null) {
			result = result + current.toString() + "-->";
			current = current.next;
		}
		result += "null";
		return result;
	}

	

}
