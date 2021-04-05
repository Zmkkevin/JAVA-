package Leetcode.tree;

public class T543_longestdistance {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        //思路：找左侧最深叶子和右侧最深叶子：
        //注意 不一定是根节点左右两侧子树 也可能是子树左右两侧距离最深：
        height(root);
        return max;
    }
    public int height(TreeNode root){
        //base case:
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        max = Math.max(max,leftheight+rightheight);
        return Math.max(leftheight,rightheight)+1;
    }
}
