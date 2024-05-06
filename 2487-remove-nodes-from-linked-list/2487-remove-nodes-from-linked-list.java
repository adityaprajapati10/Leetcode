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
    public ListNode removeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        Stack<Integer> store = new Stack<>();
        while (current != null) {
            store.push(current.val);
            current = current.next;  
        }
        int max = store.pop();
        ListNode newNode = new ListNode(max);
        while(!store.isEmpty()){
            int x = store.pop();
            if(x >= max){
                ListNode newNodex = new ListNode(x);
                newNodex.next = newNode;
                newNode = newNodex;
                max = x;
            } 
        }
        dummy.next = newNode;
        return dummy.next;
    }
}


