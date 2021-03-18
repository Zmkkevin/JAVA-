package Swardtooffer;

import java.util.List;
import java.util.Stack;

public class offer06 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        //思路：链表：从尾到头打印，放入栈中：
        //栈：
        Stack<Integer> s = new Stack<>();
        int count = 0;
        while (head != null ){
            s.add(head.val);
            head = head.next;
            count++;
        }
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = s.pop();
        }
        //return res;

    }
    //链表：
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}
        }
}
