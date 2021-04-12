package Swardtooffer;

public class offer10_i_fibonaci {
    public static void main(String[] args) {
        System.out.println(fib(44));
    }
    public static int fib(int n) {
        //记住递归时间复杂度很高：递归深度过大，栈溢出~~
        //base case:
//        if(n == 0){
//            return 0;
//        }
//        if(n == 1) return 1;
//
//        return (fib(n-1)+fib(n-2))%1000000007;

        int a = 0,b = 1,sum;
        for (int i = 0; i < n; i++) {
            sum = ( a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
