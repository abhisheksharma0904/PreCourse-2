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
// TC: O(n), n: number of nodes in the linked list.
// SC: O(1)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
       
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       }
       return slow;
    }
}
