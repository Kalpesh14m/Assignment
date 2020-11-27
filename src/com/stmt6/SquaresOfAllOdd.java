package com.stmt6;

import java.util.Arrays;
import java.util.List;

//Given a List of integers (List<Integer>), 
//write code in Java 8 style to get the sum of the squares of all the odd numbers in the array.
public class SquaresOfAllOdd {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

		int c = intList.stream().filter(i -> i % 2 != 0).map(x -> x * x).reduce(0, (a, b) -> a + b);
		System.out.println(c);
	}
}
