package Swardtooffer;

public class offer10_ii_frogupstairs {
    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
    public static int numWays(int n) {
        int a = 1, b = 1 , sum = 0;
        if(n == 0|| n == 1) return 1;
        else {
            for (int i = 0; i < n; i++) {
                sum =(a+b)%1000000007;
                a=b;
                b=sum;
            }
            return a;
        }
    }
}
