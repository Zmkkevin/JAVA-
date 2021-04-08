package Leetcode.tree;

public class T654_maximumbinary {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return bulid(nums,0,nums.length - 1);
    }
    public TreeNode bulid(int[] nums, int l, int r){
        //base case:
        //此时没元素：
        if(l > r){
            return null;
        }
        //找到数组中最大值及其索引：
        int index = -1, maxvalue = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            if( maxvalue < nums[i]){
                index = i;
                maxvalue = nums[i];
            }
        }
        //建立新树：
        TreeNode root = new TreeNode(maxvalue);
        root.left = bulid(nums,l,index - 1);
        root.right = bulid(nums,index + 1, r);
        return root;
    }
}
