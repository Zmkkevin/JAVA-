package Swardtooffer;

import java.util.ArrayList;

public class offer029_printMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        //记得加这句！如果输入为0，直接返回int[0]
        /*if (matrix.length==0){
            return new int[0];
        }*/
        int raw = matrix.length-1;
        int col = matrix[0].length - 1;
        int rstart = 0,rend = raw;
        int cstart = 0,cend = col;
        ArrayList<Integer> list = new ArrayList();
        while (rstart<=rend&&cstart<=cend){
            //上行：
            for (int i = cstart; i <= cend; i++) {
                list.add(matrix[rstart][i]);
            }
            //右行：
            for (int i = rstart+1; i <=rend ; i++) {
                list.add(matrix[i][cend]);
            }
            //下行：
            //避免重复打印：
            if(rstart!=rend){
                for(int i = cend-1;i>=cstart;i--)
                    list.add(matrix[rend][i]);
            }
            //这里不能用》= 会和第一个数重复
            if(cstart!=cend){
                for (int i = rend-1; i > rstart ; i--) {
                    list.add(matrix[i][cstart]);
                }
            }
            rstart++;rend--;cstart++;cend--;
            //
        }
        //Integer[] result = new Integer[list.size()];
        //result = list.toArray(result);
        //System.out.println(result);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        System.out.println(result);
        System.out.println(new int[0]);
    }
}
