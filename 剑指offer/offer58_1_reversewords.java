package Swardtooffer;

public class offer58_1_reversewords {
    public static void main(String[] args) {
        //反转单词：
        String s = "  hello  world!  ";
        //1:双指针存入list// 没写出来，暂时跳过
        /*
        int p = 0, p2 = 0;
        int slength = s.length();
        //去掉前后空格：
        s = s.trim();
        StringBuffer res = new StringBuffer();
        while (p<=slength){
            if(s.charAt(p) == ' '){
                p2 = p;
            }else{
            }
        }*/
        //2:
        //得到去掉首尾空格的字符串
        String[] newstr = s.trim().split(" ");
        //逆序遍历，依次添加入Stringbuffer中：要注意双空格情况：
        StringBuffer res = new StringBuffer();
        //逆序输出：
        for (int i = 0; i < newstr.length; i++) {
            System.out.println(i+" "+newstr[i]+newstr[i].length());
        }
        for (int i = newstr.length - 1 ; i >= 0; i--) {
            //注意！！ equals比较的是字符串内容 ==比较的是对象
            if(newstr[i].equals("")){
                continue;
            }else {
                res.append(newstr[i]);
                res.append(" ");
            }
        }
        String str = res.toString().trim();
        System.out.println(str);
    }
}
