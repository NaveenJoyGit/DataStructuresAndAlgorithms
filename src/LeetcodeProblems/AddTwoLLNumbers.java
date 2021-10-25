package LeetcodeProblems;

import java.util.LinkedList;

import LinkedLists.SinglyLinkedList;

public class AddTwoLLNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
        ListNode t1 = l1, t2 = l2, res = dummy;
        Integer carry = 0;
        while(t1 != null || t2 != null) {
            Integer t1Sum = t1	 != null ? t1.val : 0;
            Integer t2Sum = t2 != null ? t2.val : 0;
            Integer sum = (t1Sum + t2Sum) < 10 ? (t1Sum + t2Sum + carry) : (t1Sum + t2Sum)%10;
            carry = sum / 10;
            t1 = t1.next;
            t2 = t2.next;
            dummy.next = new ListNode(sum);
            dummy = dummy.next;
        }
        if(carry > 0) {
            dummy.next = new ListNode(carry);
        }
        return res.next;  
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode result = addTwoNumbers(l1, l2);
		System.out.println(result.val);
	}
	
}
