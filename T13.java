package Niuke;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            String[] s = str.split(" ");
            for(int i = s.length-1;i>=0;i--){
                sb.append(s[i]+" ");
            }
            //sb.reverse();
            System.out.println(sb);
        }
    }
}
