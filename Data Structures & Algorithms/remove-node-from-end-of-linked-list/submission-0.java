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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int target_index = size-n;
         if (target_index == 0) {
            return head.next;
        }
        int index=0;
        ListNode temp2 = head;
        for(int i=0;i<target_index-1;i++){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}
