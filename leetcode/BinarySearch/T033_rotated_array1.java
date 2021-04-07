package Leetcode.binarySearch;

public class T033_rotated_array1 {
    public int search(int[] nums, int target) {
        int length_nums = nums.length;
        if ( length_nums == 0) return -1;
        if (length_nums == 1) return target == nums[0] ? 0 : -1;

        int l = 0, r = length_nums - 1;
        while (l <= r){
            int m = l + (r - l)/2;
            if(nums[m] == target) return m;
            // case1： 左侧是有序时候：
            if(nums[0] <= nums[m]){
                if(nums[0] <= target && target < nums[m]){
                    r = m - 1;
                }else {
                    l = m + 1;
                }
            }
            //case 2 ： 右侧有序：
            else {
                //注意这一步：
                if(nums[m] < target && target <= nums[length_nums-1]){
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
