package Swardtooffer;

public class offer58_2 {
    public static void main(String[] args) {
       /* 输入: s = "abcdefg", k = 2
        输出: "cdefgab"*/
        String s = "abcdefg";
        int k = 2;
        System.out.println(s.substring(k)+s.substring(0,k));
    }
}
