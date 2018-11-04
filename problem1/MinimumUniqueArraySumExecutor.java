package com.pickyourtrail.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Executor service for MinimumUniqueArray.
 * 
 * @author azhagusurya.m
 *
 */
public class MinimumUniqueArraySumExecutor {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int numberOfInputs = scan.nextInt();
		List<Integer> numbers = new ArrayList<>();
		while (numberOfInputs > 0) {
			numbers.add(scan.nextInt());
			numberOfInputs--;
		}
		Collections.sort(numbers);
		UniqueArray instance = MinimumUniqueArraySum.getInstance();
		int sumOfUniqueArray = instance.getSumOfUniqueArray(numbers);
		
		System.out.println(sumOfUniqueArray);
		
	}
}
