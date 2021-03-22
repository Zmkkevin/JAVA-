package Leetcode.recursion;

public class T206 {
    public ListNode reverseList(ListNode head) {
        //反转链表：递归方法：
        if(head == null) return head;//防止输入为空
        if(head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
