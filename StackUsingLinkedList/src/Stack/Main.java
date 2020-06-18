package Stack;

public class Main {

	public static void main(String[] args) {

		LinkedStack stack = new LinkedStack();

		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		stack.push(9);

		String output = stack.toString();
		System.out.println("stack: " + output);
		System.out.println("Size of stack is:" + stack.size());
		System.out.println("Top element of stack is: " + stack.peek()+"\n");
	

		stack.push(12);
		stack.push(15);
		stack.push(19);
		System.out.println("stack: "+ stack.toString());
		System.out.println("Size of stack is:" + stack.size());
		System.out.println("Top element of stack is: " + stack.peek()+"\n");
	

		stack.pop2();
		System.out.println("stack: " + stack.toString());
		System.out.println("Size of stack is:" + stack.size());
		System.out.println("stack peek: " + stack.peek() + "\n");
		
	}

}
