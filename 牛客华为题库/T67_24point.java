package Niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T67_24point {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double[] list0 = new double[4];
            list0[0] = sc.nextInt();
            list0[1] = sc.nextInt();
            list0[2] = sc.nextInt();
            list0[3] = sc.nextInt();
            List<Double> list1 = new ArrayList<Double>();
            for(double n:list0){
                list1.add(n);
            }
            boolean res = helper(list1);
            System.out.println(res);
        }
    }
    private static boolean helper(List<Double> list1){
        if(list1.size()==0){
            return false;
        }
        if(list1.size() == 1){
            return Math.abs(list1.get(0) - 24) < 1e-6;
        }
        int size = list1.size();
        for(int i = 0;i<size; i++){
            for(int j = 0;j<size; j++){
                if(i!=j){
                    List<Double> list2 = new ArrayList<Double>();
                    for(int k = 0;k<size;k++){
                        if(k!=i&&k!=j){
                            list2.add(list1.get(k));
                        }
                    }
                    for(int cal =0;cal<4;cal++){
                        if(cal<=1&&i>j){
                            continue;
                        }
                        if (cal==0){
                            list2.add(list1.get(i)+list1.get(j));
                        }else if (cal==1){
                            list2.add(list1.get(i)*list1.get(j));
                        }else if (cal==2){
                            list2.add(list1.get(i)-list1.get(j));
                        }else if(cal==3) {
                            if (Math.abs(list1.get(j)) < 1e-6) {
                                continue;
                            } else {
                                list2.add(list1.get(i) / list1.get(j));
                            }
                        }
                        if(helper(list2)){
                            return true;
                        }
                        list2.remove(list2.size()-1);
                    }
                }
            }
        }
        return false;
    }
}
