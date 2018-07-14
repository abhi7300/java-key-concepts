package com.java8.algorithms.balancedstring;

import java.util.*;

class Solution {

	Stack<String> stack = null;
	String left = "{[(";
	String right = "}])";
	
	String bkt1 ="()";
	String bkt2 ="[]";
	String bkt3 ="{}";

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		Solution sol = new Solution();

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(sol.isBalanced(input));
		}
		sc.close();
	}

	private boolean isBalanced(String input) {

		this.stack = new Stack<String>();
		
		boolean isBalanced = false;

		for (int i = 0; i < input.length(); i++) {
			
			String popped="";
			
			if(left.contains(String.valueOf(input.charAt(i)))){
	               // push()             
	                this.stack.push(String.valueOf(input.charAt(i)));
	         }
			
            if(right.contains(String.valueOf(input.charAt(i)))){
                // pop()
                 if(!stack.empty()){
                	 popped = this.stack.pop();
                 }    
                 
                 String poppedBkt = popped+String.valueOf(input.charAt(i));
                 
                 if(poppedBkt.equals(bkt1)|| poppedBkt.equals(bkt2)|| poppedBkt.equals(bkt3)){
                	 isBalanced=true;
                 }else{
                	 isBalanced=false;
                	 return isBalanced;
                 }
             }
            
           
			//System.out.println("Stack: " + this.stack);
		}
		
		if(!this.stack.empty()){
			isBalanced=false;
		}

		return isBalanced;
	}
}
