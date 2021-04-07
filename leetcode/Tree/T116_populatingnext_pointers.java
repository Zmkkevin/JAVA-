package Leetcode.tree;

public class T116_populatingnext_pointers {
    public Node connect(Node root) {
        //base:
        if(root == null) return null;
        connectleftandright(root.left,root.right);
        return root;

    }
    void connectleftandright(Node node1, Node node2){
        if(node1 == null || node2 == null){
            return;
        }
        //执行操作：
        node1.next = node2;
        //连接子树的两个子节点：
        connectleftandright(node1.left,node1.right);
        connectleftandright(node2.left,node2.right);
        //跨子树两个节点：
        connectleftandright(node1.right,node2.left);
    }
}
