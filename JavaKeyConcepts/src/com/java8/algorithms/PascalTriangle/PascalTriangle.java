package com.java8.algorithms.PascalTriangle;


public class PascalTriangle {

	public static void main(String[] args) {

		int row = 5;
		int column = 2;
		
		int rows = 10;
		
		
		//Hockey stick will be formed by nCr th element and all the elements in n-1 th row upto the r th column
		printPascalTraiangleFor(rows);
		

	}
	

	private static void printPascalTraiangleFor(int rows) {

			for (int i=0;i<rows;i++){
				int rowNo =i;
				printRow(rowNo);
			}
		
	}

	
	private static void printRow(int rowNo) {

		  System.out.print("Row("+(rowNo+1)+")   ");
		  
			for(int i=0;i<=rowNo;i++){
				System.out.print(+getCellValue(rowNo, i)+" ");
			}
			
			System.out.println("\n");
 		
	}


	private static int getFactorial(int m) {
		int mFactorial = 1;

		for (int i = m; i > 0; i--) {
			mFactorial = i * mFactorial;
		}
		//System.out.println(m + " Factorial: " + mFactorial);

		return mFactorial;
	}

	private static int getCellValue(int row, int column) {

		int cellValue = getFactorial(row) / (getFactorial(column) * getFactorial(row - column));

		return cellValue;
	}

}
