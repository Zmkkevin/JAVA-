package Swardtooffer;

public class offer04_findinArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 13;
        //思路：从右上角开始，小于在左手，大于在下方：
        int row_length = matrix.length,col_length = matrix[0].length;
        int i = 0,j = col_length - 1;
        while (i<=row_length-1&&j>=0){
            if (matrix[i][j]==target){
                System.out.println("true");
                break;
            }else if(matrix[i][j] < target){
                i++;
            }else {
                j--;
            }
        }
    }
}
