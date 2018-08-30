package com.java8.algorithms.PerfectPower;

public class PerfectPowerApproach2 {

	public PerfectPowerApproach2() {

	}

	public Integer getPerfectPower(double x){

		// x=b^p

		int p = 0;
		double b;
		
		if(x<=0){
			throw new IllegalArgumentException("Cannot accept number <=0.");
		}

		if (x > 1) {
			for (b = 2; b <= x; b++) {

				double value = 0;
				p = 1;

				while (value <= x) {

					value = Math.pow(b, p);

					if (value == x) {
						return p;
					} else if (value > x) {
						break;
					} else {
						p++;
					}
				}

			}
		} else {

			for (b = 2; (1/b) >= x; b++) {

				double value = 1;
				p = -1;

				while (value >= x) {

					value = Math.pow(b, p);

					if (value == x) {
						return p;
					} else if (value < x) {
						break;
					} else {
						p--;
					}
				}

			}
			
		}

		return null;

	}

	public static void main(String[] args) {

		PerfectPowerApproach2 approach2 = new PerfectPowerApproach2();
		System.out.println(approach2.getPerfectPower(0.015625));
		System.out.println(approach2.getPerfectPower(81));
		System.out.println(approach2.getPerfectPower(0));
		System.out.println(approach2.getPerfectPower(-5));

	}

}
