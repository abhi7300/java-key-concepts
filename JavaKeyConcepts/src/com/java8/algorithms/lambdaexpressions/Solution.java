package com.java8.algorithms.lambdaexpressions;

import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {

		PerformOperation op = x -> {
			if (x % 2 != 0) {
				return true;
			} else {
				return false;
			}
		};

		return op;
	}

	public PerformOperation isPrime() {

		PerformOperation op = x -> {

			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					return false;
				}

			}

			return true;

		};

		return op;
	}
	
	
	public PerformOperation isPalindrome() {

		PerformOperation op = x -> {

			String numStr = String.valueOf(x);
			for (int i = 0; i < numStr.length(); i++) {
				if (numStr.charAt(i) != numStr.charAt(numStr.length()-i-1)) {
					return false;
				}
			}

			return true;

		};

		return op;
	}

}

public class Solution {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
