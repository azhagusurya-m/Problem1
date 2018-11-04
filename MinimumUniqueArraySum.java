package com.pickyourtrail.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Implementation service to generate the distinct values and calculates the sum
 * of the unique array.
 * 
 * @author azhagusurya.m
 *
 */
public class MinimumUniqueArraySum implements UniqueArray {

	private static UniqueArray instance = null;

	private static List<Integer> resultList = new ArrayList<>();

	/**
	 * This method frames a map with the number in the array as the key and it's
	 * number of occurred as the value
	 * 
	 * @example {1=1, 2=2, 3=1, 7=1}
	 * 
	 * @param numbers
	 *            - input Array
	 * @return numberOccuranceCountMap
	 */
	@Override
	public Map<Integer, Long> getDuplicateCountMap(List<Integer> numbers) {
		return numbers.stream().map(i -> i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	@Override
	public void generateUniqueArray(Map<Integer, Long> numberOccuranceCountMap) {
		resultList.addAll(numberOccuranceCountMap.keySet());
		for (Entry<Integer, Long> number : numberOccuranceCountMap.entrySet()) {
			generateUniqueElements(number);
		}
	}

	/**
	 * This method populates the result Array with unique Elements by replacing the
	 * duplicate values
	 * 
	 * @param number
	 *            - Entry
	 * 
	 */
	private static void generateUniqueElements(Entry<Integer, Long> number) {
		Long occurance = number.getValue();
		int duplicate = number.getKey();
		int replacedDistinctValue;
		while (occurance > 1) {
			replacedDistinctValue = ++duplicate;

			while (resultList.contains(replacedDistinctValue)) {
				replacedDistinctValue++;
			}
			resultList.add(replacedDistinctValue);
			occurance--;
		}
	}

	/**
	 * add all the elements in the array.
	 * 
	 * @return
	 */
	@Override
	public Integer sum() {

		int sum = 0;
		for (Integer number : resultList) {
			sum += number;
		}
		return sum;
	}

	
	@Override
	public Integer getSumOfUniqueArray(List<Integer> numbers) {
		Map<Integer, Long> numberOccuranceCountMap = getDuplicateCountMap(numbers);
		generateUniqueArray(numberOccuranceCountMap);
		return sum();

	}

	public static UniqueArray getInstance() {
		if (instance == null)
			instance = new MinimumUniqueArraySum();
		return instance;
	}
}
