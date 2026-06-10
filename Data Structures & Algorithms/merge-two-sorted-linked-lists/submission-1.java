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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode list = new ListNode(-1);
        ListNode curr = list;
        if(list1==null) return list2;
        if(list2==null) return list1;
        while(temp1!=null && temp2!=null){
            if(temp1.val <= temp2.val){
               curr.next = new ListNode(temp1.val);
               curr = curr.next;
               temp1 = temp1.next;
            }else{
                curr.next = new ListNode(temp2.val);
               curr = curr.next;
                temp2 = temp2.next;
            }
        }
        if(temp1==null){
            while(temp2!=null){
                curr.next = new ListNode(temp2.val);
               curr = curr.next;
                temp2 = temp2.next;
            }
        }
        if(temp2==null){
            while(temp1!=null){
                curr.next = new ListNode(temp1.val);
               curr = curr.next;
                temp1 = temp1.next;
            }
        }
        return list.next;
    }
}