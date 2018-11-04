package com.pickyourtrail.problem1;

import java.util.List;
import java.util.Map;

public interface UniqueArray {

	Map<Integer, Long> getDuplicateCountMap(List<Integer> numbers);

	void generateUniqueArray(Map<Integer, Long> numberOccuranceCountMap);

	Integer sum();

	Integer getSumOfUniqueArray(List<Integer> numbers);

}
