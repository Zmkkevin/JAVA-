package Swardtooffer;

public class offer55_1 {
    public int maxDepth(TreeNode root) {
        //base case:
        if(root == null){
            return 0;
        }else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
