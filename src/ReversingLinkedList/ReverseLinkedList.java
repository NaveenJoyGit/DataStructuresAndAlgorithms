package ReversingLinkedList;

public class ReverseLinkedList {
	
	Node head;

	public static void main(String[] args) {

		ReverseLinkedList lList = new ReverseLinkedList();
		lList.head = new Node();
		Node n2 = new Node(2);
		lList.head.next = n2;
		Node n3 = new Node(3);
		n2.next = n3;
		
		System.out.println(lList);
		
	}

	@Override
	public String toString() {
		return "ReverseLinkedList [head=" + head + "]";
	}
	
}
