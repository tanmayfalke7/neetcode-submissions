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
        ListNode slow = head;
        ListNode fast = head;
        ListNode middle;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next;
            fast=fast.next;
            
        }
        middle = slow.next;
        slow.next=null;
        ListNode prev = null;
        while(middle!=null){
            ListNode nxt = middle.next;
            middle.next = prev;
            prev = middle;
            middle = nxt;
        }
        ListNode first = head;
        middle = prev;
        while(middle!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = middle.next;
            first.next = middle;
            middle.next = temp1;
            first = temp1;
            middle = temp2;
        }
    }
}
