package Swardtooffer;

import java.util.HashMap;
//简单的哈希map的利用，练习增强for循环和map的put/get
public class offer050 {
    public static void main(String[] args) {
        String s = "abaccdeff";
        HashMap<Character,Integer> map = new HashMap();
        char[] arr = s.toCharArray();
        for(char i :arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        for(char i:arr){
            if(map.get(i)==1){
                System.out.println(i);
            }
        }
    }
}
