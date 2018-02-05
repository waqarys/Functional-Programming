package com.waqar.fp.timing;

import static com.waqar.fp.timing.Timing.timed;

public class Example {

	public static void main(String[] args) {
		
		final Double costs = timed("Cost calculation", 
				Example::calculateCosts);
		
		final Double revenue = timed("Revenue calculation", 
				Example::calculateRevenue);
		
		final Double profit = timed("Cost calculation", 
				() -> calculateProfit(costs, revenue));
		
		System.out.println("Profit = $"+profit);
	}
	
	private static Double calculateCosts() {
		
		return 4567.3;
	}
	
	private static Double calculateRevenue() {
		
		return 33443.3;
	}
	
	private static Double calculateProfit(Double costs, Double revenue) {
		return revenue-costs;
	}
}
