package Swardtooffer;

public class offer55_2 {
    public boolean isBalanced(TreeNode root) {

        return height(root)>=0;
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);
        if(Math.abs(lefth - righth)> 1 || lefth == -1 || righth == -1){
            return -1;
        }else {
            return Math.max(lefth,righth)+1;
        }
    }
}
