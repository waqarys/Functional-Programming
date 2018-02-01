package com.waqar.fp.typeSafe;

import com.waqar.fp.java8.FunctionOverTime;
import com.waqar.functionalprogramming.QuantityOfInterest;

public class Sales implements QuantityOfInterest {

	private final FunctionOverTime valueFunction;
	
	public Sales(FunctionOverTime valueFunction) {
		this.valueFunction = valueFunction;
	}

	@Override
	public String getName() {
		return "Sales";
	}

	@Override
	public double valueAt(int time) {
		return valueFunction.valueAt(time);
	}
	
	
}
