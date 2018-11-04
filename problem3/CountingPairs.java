package com.pickyoutrail.problem3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountingPairs {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int numberOfInputs = scan.nextInt();// size of the array.

		Set<Integer> numbers = new TreeSet<>();
		while (numberOfInputs-- > 0) {
			numbers.add(scan.nextInt());
		}

		int kDistinctDiff = scan.nextInt();
		int count = countPairsWithSameDifference(kDistinctDiff, numbers);
		System.out.println(count);
	}

	/**
	 * this method calculates the number of distinct pair with the distinct
	 * difference.
	 * 
	 * @param k
	 *            - distinct difference for each result pair
	 * @param sortedDistinctNumbers
	 *            - input numbers in sorted order with unique set.
	 * @return count of pairs with the distinct difference.
	 */
	public static int countPairsWithSameDifference(int k, Set<Integer> sortedDistinctNumbers) {
		Integer[] array = sortedDistinctNumbers.toArray(new Integer[sortedDistinctNumbers.size()]);
		int count = 0;
		int headIterator = 0;
		int tailIterator = array.length - 1;
		int indexIterator = 0;

		while (headIterator < tailIterator && indexIterator < array.length) {
			// iterating first half of the array from the begin.
			if (array[headIterator] + k == array[indexIterator]) {
				count++;
				headIterator++;
			}
			// iterating second half of the array from the end.
			if (array[tailIterator - indexIterator] + k == array[tailIterator]) {
				count++;
				tailIterator--;
			}

			indexIterator++;
		}
		return count;
	}

}
