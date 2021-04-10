package Leetcode.recursion;

public class T263 {
    public static boolean isUgly(int n) {
        //剪枝题：
        //case1: n = 1:
        while (n>0){
            if(n == 1){
                return true;
            }
            //case2: n / 2:
            else if(n%2 == 0){
                n = n/2;
            }
            else if(n%3 == 0){
                n = n/3;
            }else if(n%5 == 0){
                n = n/5;
            }else return false;
        }
        return false;
    }
}
