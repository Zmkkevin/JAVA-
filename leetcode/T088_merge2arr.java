package Leetcode.array;

import java.util.Arrays;

public class T088_merge2arr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //思路：直接从m+1向后连接数组2，最后排序：
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
