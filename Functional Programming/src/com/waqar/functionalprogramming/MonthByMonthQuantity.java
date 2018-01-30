package com.waqar.functionalprogramming;

import com.sun.xml.internal.ws.client.sei.ValueSetter;

public abstract class MonthByMonthQuantity implements QuantityOfInterest {

	private final double[] values;
	
	protected MonthByMonthQuantity(final double[] values) {
		this.values = values;
	}
	
	@Override
	public double valueAt(int time) {
		return values[time-1];
	}
}
