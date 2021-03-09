package Niuke;

import java.util.Scanner;
/*
* 思路 ： 简单利用stringbuffer类的 reverse方法来对字符串进行倒转
* 注意：用buffer类的toString方法转回String类型*/
public class T11_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
