package Stack2;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();

		System.out.println("stack size: " + stack.size() + "\n");

		stack.push('i');
		stack.push('h');
		stack.push('g');
		stack.push('f');
		System.out.println("stack: " + stack.toString());
		System.out.println("stack size: " + stack.size() + "\n");

		stack.push('e');
		stack.push('d');
		stack.pop();
		stack.push('c');
		stack.push('b');
		System.out.println("stack: " + stack.toString());
		System.out.println("stack peek: " + stack.peek());
		System.out.println("stack size: " + stack.size() + "\n");

		stack.pop();
		System.out.println("stack: " + stack.toString());
		System.out.println("stack peek: " + stack.peek() + "\n");

		stack.push('a');
		System.out.println("stack: " + stack.toString());
		System.out.println("stack size: " + stack.size() + "\n");

		Iterator<Character> it = stack.iterator();
		System.out.print("iterator: ");
		while (it.hasNext()) {
			System.out.print(it.next() + "-->");
		}
		System.out.print("null\n\n");

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("stack peek: " + stack.peek());
		System.out.println("stack: " + stack.toString());
		System.out.println("stack size: " + stack.size() + "\n");

	}
}
