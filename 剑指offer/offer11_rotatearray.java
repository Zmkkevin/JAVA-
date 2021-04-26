package Swardtooffer;

public class offer11_rotatearray {
    public int minArray(int[] numbers) {
        //二分查找：
        int l = 0,r = numbers.length - 1;
        while (l<r){
            int pivot = l +(r-l)/2;
            if(numbers[pivot]<numbers[r]){
                //则右侧没旋转，正常顺序：
                r = pivot;
            }else if(numbers[pivot] > numbers[r]){
                //则旋转了 小的一侧在右边
                l = pivot +1;
            }else {
                r = r -1;
            }
        }
        return numbers[l];
    }
}
