package Leetcode.binarySearch;

public class T081_rotated_sorted_array {
    public boolean search(int[] nums, int target) {
        //思路：二分查找查旋转点：
        //牢记：二分查找计算中值用 m = l+(h-l)/2 而不要用 m = (h+l)/2 因为后者有可能会出现溢出！！


        //这道题有可能出现重复的数字！！！！！！！！！
        int length_num = nums.length;
        if(length_num == 0){
            return false;
        }
        if (length_num == 1){
            return nums[0] == target;
        }
        //设立头尾
        int l = 0, h = length_num - 1;
        while ( l <= h){
            int m = l + (h-l)/2;
            if(nums[m] == target) return true;
            //如果几个数字相同 则左+1 右-1
            if(nums[l] == nums[m] && nums[m] == nums[h]){
                l++;
                h--;
            }
            //case 1： 左侧有序：
            else if(nums[l] <= nums[m]){
                if( nums[l] <= target && target < nums[m]){
                    h = m - 1;
                }else {
                    l = m + 1;
                }
            }else {
                if ( target > nums[m] && target <= nums[length_num - 1]){
                    l = m + 1;
                }else {
                    h = m - 1;
                }
            }
        }
        return false;
    }
}
