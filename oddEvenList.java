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

/**
 *create 2 pointers, change the link in pairs. 
 *save the even head so that it can be connected by the last node of odd list. 
 *check if the list is null or 1 or 2 elements list will increase the speed of the code.
 */
