package Swardtooffer;

import java.util.Arrays;

public class offer07_rebuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //思路：前序遍历：第一个元素永远是root：
        //     中序遍历：根节点左侧的所有元素都在跟的左子树，根节点右侧的所有元素都在根节点的右分支。

        int n = preorder.length;
        //base case:
        if(n == 0){
            return null;
        }
        //得到根节点的值：
        int rootval = preorder[0] , rootindex = 0;
        for (int i = 0; i < n; i++) {
            if(inorder[i] == rootval){
                rootindex = i;
                break;
            }
        }
        //建立树：
        TreeNode root = new TreeNode(rootval);
        //Arrays.copyOfRange(T[ ] original,int from,int to)
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootindex), Arrays.copyOfRange(inorder, 0, rootindex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootindex, n), Arrays.copyOfRange(inorder, rootindex + 1, n));

        return root;
    }
}
