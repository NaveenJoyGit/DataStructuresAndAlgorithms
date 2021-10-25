package StacksAndQueues;

public class Queue {

	class Node {
		int value;
		Node next;
		
		Node(int value) {
			this.value = value;
		}
	}
	
	Node first;
	Node last;
	int size;
	
	public Queue() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public void enqueue(int value) {
		Node newNode = new Node(value);
		size++;
		if(this.first == null) {
			this.first = newNode;
			this.last = this.first;
			return;
		}
		this.last.next = newNode;
		this.last = newNode;
		return;
	}
	
	public Node dequeue() {
		if(this.first == this.last) {
			this.last = null;
			this.first = null;
			this.size--;
			return null;
		}
		Node deleted = this.first;
		this.first = this.first.next;
		this.size--;
		return deleted;
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
	
	public int getSize() {
		return this.size;
	}
}
