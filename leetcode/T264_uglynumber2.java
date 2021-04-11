package Leetcode.recursion;

public class T264_uglynumber2 {
//    public static void main(String[] args) {
//        System.out.println(nthUglyNumber(1352));
//    }
//    public static int nthUglyNumber(int n) {
//
//        //index记录第几个
//        //System.out.println(n);
//        int index = 0;
//        int num = 1;
//        //ArrayList arr1 = new ArrayList();
//        while(index < n){
//            if(check_ugly(num) == true){
//                index++;
//            }
//            num++;
//        }
//        return num - 1;
//    }
//    public static boolean check_ugly(int num){
//        while(num>0){
//            if(num == 1){
//                return true;
//            }
//            if(num%2 == 0){
//                num = num/2;
//            }else if(num%3 == 0){
//                num = num/3;
//            }else if(num%5 == 0){
//                num = num/5;
//            }else return false;
//        }
//        return false;
//    }
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }


}
