package Swardtooffer;

import java.util.ArrayList;
import java.util.List;

public class offer57_2_slidewindow {
    public static void main(String[] args) {
        int target = 15;
        //思路：滑动窗口，小于target时候依次添加右侧元素，如果等于则记录，如果大于则左侧往右移。
        //tips:建立二维list：
        
        //!!返回值规定为int[][]， 就用
        /*List<int[]> list = new ArrayList<>();
        return list.toArray(new int[list.size()][]);*/

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int head = 1,tail = head +1;
        int nowsum = head+tail;
        //尾部小于target时候执行循环
        while (tail<target){
            //1.
            if(nowsum > target){
                nowsum-=head;
                head++;
            }else if (nowsum<target){
                tail++;
                nowsum+=tail;
            }else if(nowsum == target){
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int i = head; i < tail; i++) {
                    list1.add(i);
                }
                list.add(list1);
                //注意！
                nowsum-=head;
                head++;
                tail++;
                nowsum+=tail;
            }
        }
        System.out.println(list);

    }
}

