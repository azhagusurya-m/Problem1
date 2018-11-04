package com.pickyourtrail.problem2;

import java.util.ArrayList;
import java.util.List;

public class SuperStack implements Stack<Integer> {

	private static com.pickyourtrail.problem2.Stack<Integer> stackInstance = null;

	private static List<Integer> stack = new ArrayList<>();
	private static int topIndex = -1;

	private SuperStack() {

	}

	@Override
	public Integer push(Integer itemToBePushed) {
		topIndex++;
		stack.add(itemToBePushed);
		System.out.println(stack);
		return stack.get(topIndex);
	}

	@Override
	public Integer pop() {

		if (topIndex != -1) { // ensures the stack is not empty.
			stack.remove(topIndex);
			topIndex--;
			return topIndex == -1 ? 0 : stack.get(topIndex); // checks for the last element is pop, stack will be
																// empty.
		}
		return 0;

	}

	/**
	 * returns 0 when the stack is empty. returns -1 when the e index is greater
	 * than the stack size. returns the top element when the e is lesser than the
	 * stack size after performing the increment operation
	 * 
	 */

	@Override
	public Integer addByValue(int eUpToIndex, Integer kValueToBeAdded) {
		if (topIndex == -1)
			return 0;

		if (eUpToIndex < topIndex) {
			return -1;
		}

		for (int iterator = 0; iterator < eUpToIndex; iterator++) {
			Integer valueToBeReplaced = stack.get(iterator) + kValueToBeAdded;
			stack.set(iterator, valueToBeReplaced);
		}
		return stack.get(topIndex);
	}

	public static com.pickyourtrail.problem2.Stack<Integer> getInstance() {
		if (stackInstance == null)
			stackInstance = new SuperStack();
		return stackInstance;

	}

}
