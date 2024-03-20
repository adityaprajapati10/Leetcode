class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp2 = list2;

        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        for (int i = 1; i <= b + 1; i++) {
            temp = temp.next;
        }
        temp2.next = temp;

        ListNode current = list1;
        for (int i = 1; i <= a - 1; i++) {
            current = current.next;
        }
        
        current.next = list2;
        
        return list1;
    }
}
