package com.java8.algorithms.negetivearrays;

import java.io.*;
import java.util.*;

public class Solution {

	
	// SOLVED
	
	static int negetiveArrayCount;

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int arraySize = Integer.parseInt(in.nextLine());
		int count = 0;

		// 5
		// 1 -2 4 -5 1
		int[] array = new int[arraySize];

		while (arraySize > 0) {

			String line = in.nextLine();

			line = line.replaceAll(" ", ",");
			String[] splitArray = line.split(",");

			for (String s : splitArray) {
				array[count] = Integer.parseInt(s);
				count++;
			}


			for (int subArraySize = 1; subArraySize <= arraySize; subArraySize++) {

				int[] subArray = new int[subArraySize];
				makeSubArraysAndPrint(subArray, array, subArraySize);
			}


			System.out.println(negetiveArrayCount);
		}

	}

	private static void makeSubArraysAndPrint(int[] subArray, int[] array, int subArraySize) {

		// subArraySize 1 start:1,2,3,4,5 end:1,2,3,4,5
		// subArraySize 2 start:1,2,3,4 end:2,3,4,5
		// subArraySize 3 start:1,2,3 end:3,4,5
		// subArraySize 4 start:1,2 end:4,5
		// subArraySize 5 start:1 end:5

		for (int start = 0; start <= (array.length - subArraySize); start++) {

			for (int i = 0; i < (subArraySize); i++) {
				subArray[i] = array[start + i];
			}

			printSubArray(subArray);
			//System.out.print("\n");
			// subArray ready;

		}

	}

	private static void printSubArray(int[] subArray) {

		int arraySum = 0;

		for (int val : subArray) {
			//System.out.print(val + " ");
			arraySum = arraySum + val;
		}

		if (arraySum < 0) {
			negetiveArrayCount++;
		}

	}
}