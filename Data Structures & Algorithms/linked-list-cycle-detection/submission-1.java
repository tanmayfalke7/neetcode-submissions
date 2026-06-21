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
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        Set<Integer> map = new HashSet<>();
        ListNode temp = head;
        while(temp.next!=null){
            if(map.contains(temp.val)) return true;
            map.add(temp.val);
            temp = temp.next;
        }
        return false;
    }
}
