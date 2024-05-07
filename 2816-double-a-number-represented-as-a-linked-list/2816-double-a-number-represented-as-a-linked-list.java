/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head == null) return head;
        ListNode temp = head;
        ListNode newNode = null;

        if (temp.val >= 5) {
            newNode = new ListNode(1);
            newNode.next = temp;
        }

        while (temp != null) {
            int carry = 0;

            if (temp.next != null && temp.next.val >= 5) carry = 1;

            int digit = (temp.val * 2) + carry;
            temp.val = digit % 10;

            temp = temp.next;
        }
        if (newNode != null) head = newNode;

        return head;
    }
}
