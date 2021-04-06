package Leetcode.tree;

public class T112_sumofval {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //思路：从根节点取val，则需要找节点满足 val = targetSum - root.val
        //base case：
        if(root==null){
            return false;
        }
        if(root.left == null && root.right == null){
            //如果该点是叶子节点：直接判断该点是否等于targetsum:
            return targetSum == root.val;
        }
        //若不是叶子节点：
        return hasPathSum(root.left, targetSum-root.val)||hasPathSum(root.right,targetSum - root.val);
    }
}
