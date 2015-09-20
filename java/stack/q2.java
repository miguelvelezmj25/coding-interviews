// A string containing only parentheses is balanced if the following is true:
//
// if it is an empty string
// if A and B are correct, AB is correct,
// if A is correct, (A) and {A} and [A] are also correct.
// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
//
// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
//
// Given a string, determine if it is balanced or not.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			Deque<Character> stack = new LinkedList<Character>();
			
			String input = sc.next();

			// If there is an odd number of elements
			if(input.length() % 2 == 1) {
				System.out.println("false");

				continue;
			}

			char[] symbols = input.toCharArray();

			// Check the first symbol
			if(symbols[0] == ')' || symbols[0] == '}' || symbols[0] == ']') {
				System.out.println("false");

				continue;
			}

			stack.push(symbols[0]);
			boolean sound = true;

			for(int i = 1; i<input.length() && sound; i++) {
						
				if(symbols[i] == '(' || symbols[i] == '{' || symbols[i] == '[') {
					stack.push(symbols[i]);
				}
				else {
					if(stack.isEmpty()) {
						sound = false;		

						continue;
					}
					
					char openSymbol = stack.pop();

					if(openSymbol == '(' && symbols[i] != ')') {
						sound = false;
					}
					else if(openSymbol == '{' && symbols[i] != '}') {
						sound = false;
					}
					else if(openSymbol == '[' && symbols[i] != ']') {
						sound = false;
					}
				}
			}

			if(sound && stack.isEmpty()) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}
}
