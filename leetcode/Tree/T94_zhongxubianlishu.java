package Leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class T94_zhongxubianlishu {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        //中序遍历：
        dfs(root,res);
        return res;
    }
    public void dfs(TreeNode root,List<Integer> res){
        //base case:
        if(root == null) return;
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);

    }
}
