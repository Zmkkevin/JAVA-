package Leetcode.tree;

public class T572_subtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        return isSubtree(s.left,t)||isSubtree(s.right,t)||checksub(s,t);
    }
    private boolean checksub(TreeNode s,TreeNode t){
        if(t == null && s == null) return true;
        if(s == null || t == null) return false;
        if(s.val != t.val) return false;
        return checksub(s.left,t.left) && checksub(s.right,t.right);
    }
}
