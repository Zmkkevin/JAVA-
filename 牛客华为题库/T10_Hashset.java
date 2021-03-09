package Niuke;

import java.util.HashSet;
import java.util.Scanner;
//思路 将接收到的字符串转成char数组 用set筛掉重复字符。
public class T10_Hashset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        //用哈希表筛掉多余字符：
        HashSet<Character> set = new HashSet();
        for(int i = 0;i<ch.length;i++){
            set.add(ch[i]);
        }
        System.out.println(set.size());
    }


}
