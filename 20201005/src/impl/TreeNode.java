package impl;

public class TreeNode {
    int v;
    TreeNode right;
    TreeNode left;

    TreeNode(int x){
        v=x;
    }

    @Override
    public String toString() {
        return String.format("%c",v);
    }
}
