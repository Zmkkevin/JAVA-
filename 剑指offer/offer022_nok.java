package Swardtooffer;

public class offer022_nok {
    public ListNode getKthFromEnd(ListNode head, int k) {

        //双指针解决：第一个出去的指针比第二个指针多走k步，
        ListNode pfirst = head;
        while(pfirst != null && k>0){
            pfirst = pfirst.next;
            k--;
        }
        //当k=0，第二个指针出发：
        ListNode pnext = head;
        while(pfirst != null){
            pfirst = pfirst.next;
            pnext = pnext.next;
        }
        return pnext;
    }

}

