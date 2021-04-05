package Leetcode.tree;

public class T110_balancedbinaryTree {
    //判断是否是平衡二叉树：
    //思路：自下而上判断，对于满足平衡的子树返回其树高，否则返回-1：
    //当返回值<0时不平衡
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }
    public int height(TreeNode root){
        //base case:
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        //判断是否左右平衡：
        if(Math.abs(leftheight - rightheight)> 1 || leftheight == -1 || rightheight == -1){
            return -1;
        }else {
            //返回最深子树高度+1
            return Math.max(leftheight,rightheight) +1;
        }
    }
}
