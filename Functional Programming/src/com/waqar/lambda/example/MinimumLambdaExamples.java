package com.waqar.lambda.example;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class MinimumLambdaExamples {

	public static void main(String[] args) {
		
		IntToDoubleFunction incrementalCosts = time -> 5.1 + 0.15 * time;
		
		Function<String, Integer> wordCount = (String s) -> s.split(" ").length;
		
		BiFunction<String, Integer, Boolean> exceedMaxLength = (s, maxLength) -> {
			int actualLenght = s.length();
			return actualLenght > maxLength;
		};
	}
}
