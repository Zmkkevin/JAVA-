package Niuke;

import java.util.Scanner;

public class T17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] s = str.split(";");
            int[] zb = {0,0};
            for(String c:s){
                if(c.matches("[ADSW]\\d{1,2}")){
                    int num = Integer.valueOf(c.substring(1));
                    if(c.charAt(0)=='A'){
                        zb[0] -= num;
                    }else if(c.charAt(0) == 'W'){
                        zb[1] += num;
                    }else if(c.charAt(0) == 'S'){
                        zb[1] -= num;
                    }else if(c.charAt(0) == 'D'){
                        zb[0] += num;
                    }
                }
            }
            System.out.println(zb[0] + "," + zb[1]);
        }
    }
}