package Leetcode.Doublelinked;

import java.util.Arrays;
import java.util.HashSet;

public class T345_reverseString {
    public static void main(String[] args) {
        String s ="leetcode";
        char[] c =s.toCharArray();
        //用Arrays.asList()方法将数组转化成set
        HashSet<Character> hash = new HashSet<>();
        hash.add('a');
        hash.add('e');
        hash.add('i');
        hash.add('o');
        hash.add('u');
        hash.add('A');
        hash.add('E');
        hash.add('I');
        hash.add('O');
        hash.add('U');

        int head = 0,tail = c.length -1;
        while(head<tail){
            if(hash.contains(c[head])&hash.contains(c[tail])){
                char temp =  c[head];
                c[head] = c[tail];
                c[tail] = temp;
                head++;
                tail--;
            }else if(!hash.contains(c[head])){
                head++;
            }else if(!hash.contains(c[tail])){
                tail--;
            }
        }
        String result = "";
        for(char i:c){
            result = result+i;
        }
        System.out.println(result);
        //return result;
    }
}
