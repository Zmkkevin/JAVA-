package Leetcode.Doublelinked;

public class T633_sumof2 {
    public static void main(String[] args) {
        int c = 5;
        //思路 最大范围不超过c的开方
        int i = 0,j = (int)Math.sqrt(c);
        while(i<j){
            int sum = i*i+j*j;
            if(sum == c){
                //return true;
            }else if(sum>c){
                j-=1;
            }else{
                i+=1;
            }
        }
    }
}
