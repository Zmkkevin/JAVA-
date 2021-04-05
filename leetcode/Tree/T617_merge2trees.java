package Leetcode.tree;

public class T617_merge2trees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //base case:
        if (root1 == null && root2 == null){
            return null;
        }
        if(root1 == null){
            return root2;
        }
        if (root2 == null){
            return root1;
        }
        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left,root2.left);
        root.right = mergeTrees(root1.right,root2.right);
        return root;
    }
}