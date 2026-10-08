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
    public static ListNode middle(ListNode head){
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode middle=middle(head);
        ListNode reverseHead = reverse(middle.next);
        middle.next = null;
        ListNode p1 = head,p2=reverseHead;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode curr = dummy;
        while(p2!=null){
            ListNode next1 = p1.next;
            ListNode next2 = p2.next;
            curr.next = p1;
            curr = curr.next;
            curr.next = p2;
            curr = curr.next;
            p1 = next1;
            p2 = next2;
        }
        if(p1!=null){            
            curr.next = p1;
        }
        
    }
}
