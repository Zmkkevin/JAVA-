package Swardtooffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class offer03_repeatednums {
    public static void main(String[] args) {
        //超时了：
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        /*int[] nums = {2, 3, 1, 0, 2, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i :nums){
            if(!list.contains(i)){
                list.add(i);
            }else if(list.contains(i)){
                result.add(i);
            }
        }
        System.out.println(result);*/
        //思路：建立hashset，for循环添加，如果添加返回false，则说明set中已经有该数。
        HashSet<Integer> set = new HashSet<>();
        int result = -1;
        for(int i :nums){
            if(!set.add(i)){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
