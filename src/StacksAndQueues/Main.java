package StacksAndQueues;

public class Main {

	public static void main(String[] args) {
		/*
		 * ArrayStack
		 */
		ArrayStack as = new ArrayStack();
		as.push(4);
		as.push(7);
		as.push(2);
		as.print();
		as.pop();
		as.print();
		as.push(13);
		as.print();
		
		/*
		 * LL stack
		 */
		Stack s = new Stack();
		s.push(12);
		s.push(1);
		s.push(22);
		s.push(6);
		s.push(45);
		s.push(34);
		s.pop();
		s.pop();
		s.print();
		
		/*
		 * LL Queue
		 */
		System.out.println("**************QUEUE***************");
		Queue q = new Queue();
		q.enqueue(3);
		q.enqueue(6);
		q.enqueue(4);
		q.enqueue(1);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(5);
		q.enqueue(156);
		q.print();
	}
	
}
