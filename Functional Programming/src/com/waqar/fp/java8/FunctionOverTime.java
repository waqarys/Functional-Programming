package com.waqar.fp.java8;

@FunctionalInterface
public interface FunctionOverTime {

	double valueAt(int time);

	static FunctionOverTime monthByMonth(final double[] values) {
		return time -> values[time-1];
	}
	
	static FunctionOverTime constant(final double value) {
		//return time -> value;
		return polynomial(new double[] {value});
	}
	
	static FunctionOverTime line(final double intercept, final double slope) {
		//return time -> intercept + time*slope;
		return polynomial(new double[] {intercept, slope});
	}
	
	static FunctionOverTime polynomial(final double[] coefficients) {
		return time -> {
			Double sum =0.0;
			for(int i=0; i<coefficients.length; i++) {
				sum += Math.pow(time, i) * coefficients[i];
			}
			return sum;
		};
	}
}
