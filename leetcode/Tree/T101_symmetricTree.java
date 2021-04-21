package Leetcode.tree;

public class T101_symmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checks(root.left,root.right);
    }
    private boolean checks(TreeNode leftT,TreeNode rightT){
        if(leftT == null && rightT== null) return true;
        if(leftT == null || rightT == null) return false;
        if(leftT.val != rightT.val) return false;
        return (checks(leftT.left,rightT.right)&&checks(leftT.right,rightT.left));
    }
}
