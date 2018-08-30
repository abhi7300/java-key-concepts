package com.java8.algorithms.PerfectPower;

public class PerfectPowerApporach1  {

	public static int getPerfectPower(long x) {

		// https://algs4.cs.princeton.edu/24pq/PerfectPower.java.html

		// x=b^p

		//long x = 81;
		int p = 0;
		int b = 2;

		int exponent = 1;
		long power = 1;

		if (x > 1) {
			
			while (b <= x) {


				while (exponent > 0) {

					power = power(b, exponent);

					if (x == power) {
						p = exponent;
						break;
					} else if (power > x) {
						exponent=1;
						break;
					}

					exponent++;
				}

				if (p == 0) {
					b++;
				} else {
					break;
				}
			}
		} else {
			p = 1;
		}

		
		return p;
	}

	private static long power(int b, int p) {

		long pow = 1;

		for (int i = 1; i <= p; i++) {

			pow = pow * b;
		}

		return pow;
	}
	
	
	public static void main(String[] args) {
		
		
		int p = PerfectPowerApporach1.getPerfectPower(17);

		System.out.println("p: " + p);
		
		
	}


}