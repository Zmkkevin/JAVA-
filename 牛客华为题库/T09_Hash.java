package Niuke;

import java.util.LinkedHashSet;
import java.util.Scanner;
//思路 linkedHashSet剔除重复元素，并且保留固定顺序：
/*
* 注意点：1.反向遍历的写法！
*        2.如果是字符串数组，如何转化成字符串：遍历时候用str = str +各个字符
* */
public class T09_Hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] num = str.toCharArray();

        LinkedHashSet<Character> set = new LinkedHashSet();
        for(int i = num.length-1; i>=0;i--){
            set.add(num[i]);
        }
        String result = "";
        for(char i:set){
            result = result+i;
        }
        System.out.println(result);
    }
}
