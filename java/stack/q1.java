// Sort a stack in ascending order. You may use at most one additional stack to 
// hold items, but you may not copy the elements into any other data structure.

import java.util.Stack;

public class q1 {
	
	public static void main(String[] args) {	
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(4);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.push(5);
		stack.push(0);
	
		stack = sortStack(stack);
			
		while(!stack.isEmpty()) {	
			System.out.println(stack.pop());
		}
	}

	public static Stack<Integer> sortStack(Stack<Integer> stack) { 
		Stack<Integer> sorted = new Stack<Integer>();

		// Get the top of the stack in a temp variable and
		// push it into the sorted array
		int tmp = stack.pop();
		
		sorted.push(tmp);

		// Loop through all the elements in the stack
		while(!stack.isEmpty()) {
			// Pop from the original stack
			tmp = stack.pop();

			// Pop from the sorted and push into the original
			// until we find the correct spot for the tmp
			while(!sorted.isEmpty() && tmp < sorted.peek()) {	
				stack.push(sorted.pop());
			}

			// Push the tmp variable
			sorted.push(tmp);
		}

		// Return the sorted stack
		return sorted;
		
	}

}
