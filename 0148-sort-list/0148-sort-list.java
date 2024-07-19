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
    public ListNode sortList(ListNode head) {
    
        int n = 0;
        ListNode current = head ;
        while(current != null){
            n++;
            current = current.next;
        }
        int[] arr = new int[n];
        int index = 0;
        current = head;
        while(current != null){
            arr[index] = current.val;
            index++;
            current = current.next;
        }
        index = 0;
        Arrays.sort(arr);
        current = head;
        while(current != null){
            current.val = arr[index] ;
            index++;
            current = current.next;
        }
        return head;
    }
}