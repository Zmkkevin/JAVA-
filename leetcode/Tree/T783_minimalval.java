package Leetcode.tree;

public class T783_minimalval {
    //二叉树中序遍历！！！
    int pre;
    int res;
    public int minDiffInBST(TreeNode root) {
        //递归：中序遍历：
        //base case:
        res = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        //base case:
        if(root == null) return;
        dfs(root.left);
        //如果是第一个：
        if(pre == -1){
            pre = root.val;
        }else {
            res = Math.min(res,root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
}
