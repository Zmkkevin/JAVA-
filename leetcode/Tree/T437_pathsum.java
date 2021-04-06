package Leetcode.tree;

public class T437_pathsum {
    public int countpath = 0;
    public int pathSum(TreeNode root, int sum) {
        //思路：对每个点递归求路径，再递归每个点
        if(root == null){
            return 0;
        }
        sumpath(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return countpath;
    }
    public void sumpath(TreeNode root, int sum){
        if(root == null) return;
        if (sum - root.val == 0){
            countpath++;
        }
        sumpath(root.left,sum - root.val);
        sumpath(root.right, sum - root.val);
    }

}
