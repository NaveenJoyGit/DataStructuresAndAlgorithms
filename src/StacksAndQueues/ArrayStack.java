package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack {

	List<Integer> arrayStack;
	
	ArrayStack() {
		this.arrayStack = new ArrayList<>();
	}
	
	void push(int value) {
		arrayStack.add(value);
	}
	
	void pop() {
		int length = arrayStack.size();
		arrayStack.remove(length - 1);
	}
	
	void print() {
		System.out.println(arrayStack);
	}
	
}
