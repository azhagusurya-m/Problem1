package com.pickyourtrail.problem2;

public interface Stack<T> {
	public T push(T itemToBePushed);
	public T pop();
	public T addByValue(int eUpToIndex,T kValueToBeAdded);
}
