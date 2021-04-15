package Swardtooffer;

import java.util.ArrayList;
import java.util.List;

public class offer54 {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list.get(list.size()-k);
    }
    public void dfs(TreeNode root,List<Integer> list){
        if(root == null) return;
        if(root.left != null){
            dfs(root.left,list);
        }
        list.add(root.val);
        if (root.right != null){
            dfs(root.right,list);
        }
    }
}
