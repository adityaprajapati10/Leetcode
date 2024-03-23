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
    public void reorderList(ListNode head) {
        ListNode current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }
        int[] arr = new int[count];
        current = head;
        int k = 0;
        while(current != null){
            arr[k] = current.val; 
            current = current.next;
            k++; 
        }

        int i = 0 , j = arr.length-1;
        current = head;
        int index = 0;
        while(current != null && i <= j){
            if(index % 2 == 0){
                current.val = arr[i++];
            }
            else{
                current.val = arr[j--];
            }
            current = current.next;
            index++;
        }
    }
}