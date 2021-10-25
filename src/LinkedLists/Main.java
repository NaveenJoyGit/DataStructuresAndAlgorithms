package LinkedLists;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.push(3);
		ll.push(5);
		ll.push(7);
		ll.push(1);
		ll.push(9);
		ll.traverse();
		ll.reverse();
		ll.traverse();
		ll.pop();
		ll.reverse();
		ll.traverse();
	}
	
}
