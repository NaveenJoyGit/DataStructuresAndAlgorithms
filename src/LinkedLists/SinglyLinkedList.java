package LinkedLists;

public class SinglyLinkedList {

	/*
	 * Inner node class
	 */
	public class Node {
		public Integer value;
		public Node next;
		
		Node(Integer value) {
			this.value = value;
		}
	}
	
	
	public Node head;
	private Node tail;
	private Integer length;
	
	public Node getHead() {
		return this.head;
	}
	
	public Node getTail() {
		return this.tail;
	}
	
	public Integer getLength() {
		return this.length;
	}
	
	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void push(Integer value) {
		Node newNode = new Node(value);
		if(this.head == null) {
			this.head = newNode;
			this.tail = this.head;
		}
		this.length++;
		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	public void traverse() {
		Node temp = this.head;
		while(temp != null) {
			System.out.print(temp.value + (temp.next == null ? " " : " -> "));
			temp = temp.next;
		}
		System.out.print(" Length = " + this.length + 
				" Head = " + (this.head == null ? "null" : this.head.value) + 
				" Tail = " + (this.tail == null ? "null" : this.tail.value) + "\n");
	}
	
	public Integer pop() {
		this.length--;
		if(this.head == this.tail) {
			this.head = null;
			this.tail = null;
			return null;
		}
		Node temp = this.head.next;
		Node newTail = this.head;
		while(temp.next != null) {
			newTail = temp;
			temp = temp.next;
		}
		newTail.next = null;
		this.tail = newTail;
		return newTail.value;
	}
	
	public Node shift() {
		if(this.head == null) return null;
		Node newHead = this.head;
		this.head = this.head.next;
		this.length--;
		return newHead;
	}
	
	/*
	 * method to add value to the beginning of the SLL
	 */
	public Node	unShift(Integer newValue) {
		Node newNode = new Node(newValue);
		this.length++;
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return newNode;
		}
		newNode.next = this.head;
		this.head = newNode;
		return newNode;
	}
	
	/*
	 * Returns the node at the specified index
	 */
	public Node get(Integer index) {
		if(index < this.length && index >= 0) {
			int indexCount = 0;
			Node temp = this.head;
			while(indexCount != index) {
				temp = temp.next;
				indexCount++;
			}
			return temp;			
		}
		return null;
	}
	
	public Boolean set(Integer index, Integer value) {
		Node foundNode = get(index);
		if(foundNode != null) {
			foundNode.value = value;
			return true;
		}
		return false;
	}
	
	public Boolean insert(Integer index, Integer value) {
		if(index < 0 || index > this.length) return false;
		Node newNode = new Node(value);
		if(index == 0) {
			unShift(value);
			return true;
		}
		else if(index == this.length) {
			push(value);
			return true;
		}
		this.length++;
		Node beforeNode = get(index - 1);
		newNode.next = beforeNode.next;
		beforeNode.next = newNode;
		return true;
	}
	
	public Boolean remove(int index) {
		if(index >= this.length && index < 0) return false;
		if(index == this.length - 1) {
			pop();
			return true;
		}
		else if(index == 0) {
			shift();
			return true;
		}
		length--;
		Node nodeBeforeNodeToRemove = get(index - 1);
		nodeBeforeNodeToRemove.next = nodeBeforeNodeToRemove.next.next;
		return true;
	}
	
	/*
	 *(Brute force solution)
	public void reverse() {
		Node tempHead = null;
		for(int i = this.length - 1; i >= 1; i--) {
			Node tempNode = get(i - 1);
			Node currentNode = tempNode.next;
			if(currentNode == this.tail) {
				tempHead = this.tail;
			}
			tempNode.next = null;
			currentNode.next = tempNode;
			System.out.println(currentNode.value);
			if(i == 1) {
				this.tail = tempNode;
			}
		}
		this.head = tempHead;
	}*/
	
	/*
	 * Optimized solutn for reverse
	 */
	void reverse() {
		Node node = this.head;
		this.head = this.tail;
		this.tail = node;
		Node prev = null;
		Node next = null;
		for(int i = 0; i < this.length; ++i) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;			
		}
	}
	
	
}
