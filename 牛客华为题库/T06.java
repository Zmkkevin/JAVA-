package Niuke;

import java.util.Scanner;

public class T06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long half = (long)Math.sqrt(num);

        for(long i = 2;i<=half;i++){
            while(num%i == 0){
                System.out.print(i+" ");
                num = num/i;
            }
        }
        System.out.println(num == 1 ? "":num+" ");

    }
}
