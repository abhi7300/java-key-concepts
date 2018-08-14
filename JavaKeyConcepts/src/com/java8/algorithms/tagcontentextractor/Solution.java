package com.java8.algorithms.tagcontentextractor;

import java.io.*;
import java.lang.Character.Subset;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			
			String line = in.nextLine();

			printTagContent(line);

			testCases--;
		}
	}

	private static String printTagContent(String line) {

		String content = null;
		String subContent = null;
		String startTag = null;
		String endTag = null;

		if (line.startsWith("<")) {

			for (int i = 0; i < line.length(); i++) {

				if (">".equals(line.substring(i, i + 1))) {
					startTag =  line.substring(0, i) + ">";
					endTag = "</" + line.substring(1, i) + ">";
					break;
				}

			}

			if (startTag != null && endTag != null && (line.indexOf(endTag) == (line.length() - endTag.length()))) {

				subContent = line.substring(startTag.length(), (line.length() - endTag.length()));
				printTagContent(subContent);

			} else {
				// either tag is invalid
				if (line.indexOf(endTag) == -1) {
					System.out.println("None");
				}
				// or more tags are in the same line
				if (line.indexOf(endTag) + endTag.length() < line.length()) {
					int fromLength = line.indexOf(endTag) + endTag.length();
					printTagContent(line.substring(fromLength));
				}
			}

		} else if (line.endsWith(">")) {

			// invalid tag
			if ("/".equals(line.substring((line.lastIndexOf("<") + 1), (line.lastIndexOf("<") + 2)))) {
				return "None";
			} else {

				// valid text
				System.out.println(line);
			}

		} else {
			System.out.println(line);
		}

		if (isTagValid(line)) {

		}

		return content;

	}

	private static boolean isTagValid(String tagLine) {

		return true;
	}

}
