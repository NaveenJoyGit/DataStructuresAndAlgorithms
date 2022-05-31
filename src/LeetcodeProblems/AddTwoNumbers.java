package LeetcodeProblems;

public class AddTwoNumbers {


    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersWithCarry(l1, l2, 0);
    }

    public static ListNode addTwoNumbersWithCarry(ListNode l1, ListNode l2, int carry) {

        if (l1 == null && l2 == null && carry == 0) return null;
        ListNode result = new ListNode();
        //In case when any one list-node is null, we need to default that to 0
        int a = l1 == null ? 0 : l1.val;
        int b = l2 == null ? 0 : l2.val;
        int sum = a + b + carry;
        carry = sum > 9 ? 1 : 0; //carry can have only either 1 or 0
        sum = carry > 0 ? sum % 10 : sum;
        result.val = sum;
        // If one list-node is null, the recursive call is made with the same list-node until both are null
        l1 = l1 == null ? l1 : l1.next;
        l2 = l2 == null ? l2 : l2.next;
        ListNode next = addTwoNumbersWithCarry(l1, l2, carry);
        result.next = next;
        return result;
    }

    public static void main(String[] args) {

        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(9);
        ListNode a4 = new ListNode(9);
        ListNode a5 = new ListNode(9);
        ListNode a6 = new ListNode(9);
        ListNode a7 = new ListNode(9);

        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9);
        ListNode b3 = new ListNode(9);
        ListNode b4 = new ListNode(9);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = null;

        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = null;

        ListNode result = addTwoNumbers(a1, b1);


    }

}
