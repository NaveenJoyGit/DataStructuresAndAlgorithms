package ReversingLinkedList;

public class Node {

	int index;
	Node next;
	
	public Node() {
	}
	
	public Node(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return index + " " + next + " ";
	}
	
	
}
