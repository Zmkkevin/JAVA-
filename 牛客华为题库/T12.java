package Niuke;

import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        //StringBuffer:
        //nextline全部识别 next遇到空行就停止
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer sb = new StringBuffer(sc.next());
            sb.reverse();
            System.out.println(sb);
        }
    }
}
