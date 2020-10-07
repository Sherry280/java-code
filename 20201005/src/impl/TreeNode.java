package impl;

public class TreeNode {
    public int v;
    public TreeNode right;
    public TreeNode left;

    TreeNode(int x){
        v=x;
    }

    @Override
    public String toString() {
        return String.format("%c",v);
    }
}
