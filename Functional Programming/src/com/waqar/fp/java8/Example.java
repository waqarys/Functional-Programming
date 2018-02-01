package com.waqar.fp.java8;

import com.waqar.functionalprogramming.FixedCosts;
import com.waqar.functionalprogramming.IncrementalCosts;
import com.waqar.functionalprogramming.Sales;

public class Example {

	final static double [] EXPECTED_SALES_JAN_TO_DEC = 
			new double[] {42.0, 45.6, 43.6, 50.2, 55.6, 54.7, 58.0, 57.3, 62.0, 60.3, 71.2, 88.8};
	
	public static void main(String[] args) {
		
		/*final FunctionOverTime sales = 
				(time) -> EXPECTED_SALES_JAN_TO_DEC[time-1];*/
		final FunctionOverTime sales = 
				FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC);
		
		/*final FunctionOverTime fixedCosts = 
				(time) -> 0.15;*/
		final FunctionOverTime fixedCosts = 
				FunctionOverTime.constant(0.15);
		
		/*final FunctionOverTime incrementalCosts = 
				(time) -> 5.1 + 0.15 * time;*/
		final FunctionOverTime incrementalCosts = 
				FunctionOverTime.line(5.1,  0.15);
		
		
		/*final FunctionOverTime profit = 
				(time) -> sales.valueAt(time) - 
				(fixedCosts.valueAt(time) +
						incrementalCosts.valueAt(time));*/
		
		final FunctionOverTime profit = 
				FunctionOverTime.combinationOf3(
						sales, incrementalCosts, fixedCosts,
						(s, ic, fc) -> s-ic-fc
						);
		
		double total = 0.0;
		for(int i=1; i<=12; i++){
			total += profit.valueAt(i);
		}
		
		System.out.println("Total profits for the year: "+ total);
	}
}
