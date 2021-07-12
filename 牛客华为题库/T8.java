package Niuke;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
            for(int i = 0;i<num;i++){
                int key = sc.nextInt();
                int val = sc.nextInt();
                map.put(key,map.getOrDefault(key,0)+val);
            }
            for(Integer res:map.keySet()){
                System.out.println(res+ " "+ map.get(res));
            }
        }
    }
}
