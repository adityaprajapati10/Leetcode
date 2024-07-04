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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode demo = new ListNode(0);
        ListNode temp = demo;
        int sum = 0;
        while(curr != null){
            if(curr.val > 0){
                sum += curr.val;

            }
            else{
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return demo.next;
    }
}