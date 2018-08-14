package com.java8.concepts;

public class TestClass5_OperatorPrecedence {



	public static void main(String args[]) {

		// Example 1
		/*
		 * The statement iA[i] = i = 30 ; will be processed as follows: iA[i] = i =
		 * 30; => iA[0] = i = 30 ; => i = 30; iA[0] = i ; => iA[0] = 30 ;
		 * 
		 * Here is what JLS says on this: 1 Evaluate Left-Hand Operand First 2
		 * Evaluate Operands before Operation 3 Evaluation Respects Parentheses and
		 * Precedence 4 Argument Lists are Evaluated Left-to-Right
		 * 
		 * For Arrays: First, the dimension expressions are evaluated,
		 * left-to-right. If any of the expression evaluations completes abruptly,
		 * the expressions to the right of it are not evaluated.
		 */
		int i = 0;
		int[] iA = { 10, 20 };
		iA[i] = i = 30;
		System.out.println("" + iA[0] + " " + iA[1] + "  " + i);

		
		
		// Example 2
		/*
		s += (expression) will be converted to s =  s + expression. 
		So the given expression will become: 
		s = s + s + mx(s) + ++s; 
		s = 5 + 5 + mx(5) + 6; 
		s = 5 + 5+ 8 + 6; 
		s = 24;*/
		
		int s = 5;
		s += s + mx(s) + ++s;
		System.out.println(s);
	}

	static int mx(int s) {
		for (int i = 0; i < 3; i++) {
			s = s + i;
		}
		return s;
	}
}