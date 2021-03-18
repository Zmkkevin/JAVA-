package Swardtooffer;

public class offer18_fakenode {
    public ListNode deleteNode(ListNode head, int val) {
        //要记得尝试用哑节点：
        ListNode fake = new ListNode(-1);
        fake.next = head;
        //让指针1指向fakenode：
        ListNode p1 = fake;
        while(p1.next != null){
            if(p1.next.val == val){
                p1.next = p1.next.next;
            }else{
                p1 = p1.next;
            }
        }
        return fake.next;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
