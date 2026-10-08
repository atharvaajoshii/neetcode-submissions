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
    public static int length(ListNode head){
        if(head==null)return 0;
        if(head.next==null) return 1;
        ListNode p = head;
        int c=0;
        while(p!=null){
            p=p.next;
            c++;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = length(head);
        if(size==0 || size ==1){return null;}
        if(n==size){head=head.next; return head;}
        int target=size-n;
        ListNode p=head;
        for(int i=1;i<target;i++){
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }
}
