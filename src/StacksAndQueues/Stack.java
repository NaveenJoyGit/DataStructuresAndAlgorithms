package StacksAndQueues;

public class Stack {

	class Node {
		int value;
		Node next;
		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}
	
	Node first;
	Node last;
	int size;
	
	Stack() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	void push(int value) {
		Node newFirst = new Node(value);
		this.size++;
		if(this.first == null) {
			this.first = newFirst;
			this.last = this.first;
			return;
		}
		newFirst.next = this.first;
		this.first = newFirst;	
	}
	
	void pop() {
		Node newFirst = this.first.next;
		this.first = newFirst;		
		this.size--;
	}
	
	void print() {
		Node temp = this.first;
		while(temp != null) {
			System.out.print(temp.value + (temp.next == null ? " " : " -> "));
			temp = temp.next;
		}
		System.out.print(" Size = " + this.size + 
				" First = " + (this.first == null ? "null" : this.first.value) + 
				" Last = " + (this.last == null ? "null" : this.last.value) + "\n");
	}
	
}
