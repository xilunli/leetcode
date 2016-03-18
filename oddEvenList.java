/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next==null) return head;
        ListNode evenHead = head.next;
        ListNode p = head;
        ListNode q = p.next;
        while(q != null && q.next != null) {
            p.next = q.next;
            q.next = q.next.next;
            p = p.next;
            q = q.next;
        }
        p.next = evenHead;
        return head;
    }
}
