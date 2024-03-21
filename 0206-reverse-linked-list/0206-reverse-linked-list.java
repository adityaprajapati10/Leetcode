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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode nextPtr = null;
        ListNode previousPtr = null;

        while(current != null){
            nextPtr = current.next;
            current.next = previousPtr;
            previousPtr = current;
            current = nextPtr;
        }
        head = previousPtr;
        return head;
    }
}