class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode tail = head.next;
        ListNode ansHead = reverseList(head.next);
        tail.next = head;
        head.next = null;
        
        return ansHead;
    }
}
