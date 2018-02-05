package com.waqar.fp.timing;

import java.util.Date;
import java.util.function.Supplier;

public class Timing {

	public static <A> A timed(String description, Supplier<A> code){
		final Date before = new Date();
		A result = code.get();
		final Long duration = new Date().getTime() -
				before.getTime();
		System.out.println(description + " took "+duration + " milliseconds");
		
		return result;
	}
}
