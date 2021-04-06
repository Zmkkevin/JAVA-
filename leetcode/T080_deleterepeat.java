package Leetcode.array;

public class T080_deleterepeat {
    public int removeDuplicates(int[] nums) {
        //注意是有序数组：

        //如果length<2，则直接返回该数组长度：
        if(nums.length <= 2){
            return nums.length;
        }
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            //如果不等于前前一个元素，则能加入：
            if(nums[i] != nums[index-2]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
