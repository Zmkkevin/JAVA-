package Leetcode.tree;

public class T226_reversetree {
    public TreeNode invertTree(TreeNode root) {
        //base case:
        if(root == null){
            return null;
        }

        //遍历时互换：
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        //recursive:
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
