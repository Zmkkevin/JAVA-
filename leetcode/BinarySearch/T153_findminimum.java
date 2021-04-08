package Leetcode.array;

public class T153_findminimum {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1 , m ;

        while(l<r){
            //case1:左侧按顺序：
            m = l + (r - l)/2;

            //case1:左侧按顺序：
            if(nums[m]< nums[r]){
                r = m;
            }else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}
