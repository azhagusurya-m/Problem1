package com.pickyourtrail.problem2;

import java.util.Scanner;

public class SuperStackExecutor {

	private static final String NOT_A_VALID_ACTION = "entered input doesnot contain any of a push / pop / inc valid action.";

	private static final String EMPTY = "EMPTY";

	private static final String CANNOT_PERFORM_INCREMENT_ACTION = "entered e value is greater than the stack size, cannot perform increment action.";
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int numberOfActions; // alias for n,
		numberOfActions = scan.nextInt();
		while (numberOfActions-- > 0) {
			String[] actionAndValue = getInputAction();
			performAction(actionAndValue);
		}

	}

	/**
	 * this method is used to get and splits the action to be performed on the stack
	 * and it's corresponding integer inputs.
	 * 
	 * @return actionAndValue
	 */
	private static String[] getInputAction() {
		String actionAndValue = scan.nextLine();
		while (actionAndValue.isEmpty()) // ignores empty line and it would wait for the user to print appropriate
											// input.
			actionAndValue = scan.nextLine();
		return actionAndValue.split(" ");

	}

	/**
	 * this method invokes the stack operation respective to the action specified.
	 * 
	 * @param actionAndValue
	 */
	public static void performAction(String[] actionAndValue) {
		com.pickyourtrail.problem2.Stack<Integer> stackInstance = SuperStack.getInstance();
		switch (StackOperation.valueOf(actionAndValue[0].toUpperCase())) {
		case PUSH:
			int itemToBePushed = toInteger(actionAndValue[1]);
			System.out.println(stackInstance.push(itemToBePushed));
			break;
		case POP:
			int element = stackInstance.pop();
			System.out.println(element == 0 ? EMPTY : element);
			break;
		case INC:
			int e = toInteger(actionAndValue[1]);
			int k = toInteger(actionAndValue[2]);
			element = stackInstance.addByValue(e, k);
			System.out.println(element == 0 ? EMPTY : element == -1 ? CANNOT_PERFORM_INCREMENT_ACTION : element);
			break;
		default:
			System.out.println(NOT_A_VALID_ACTION);
		}
	}

	private static int toInteger(String string) {
		return Integer.parseInt(string);

	}

}
