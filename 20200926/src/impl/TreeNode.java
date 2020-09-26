package impl;

public class TreeNode {
    int v;
    TreeNode right;
    TreeNode left;

    public TreeNode(int v) {

        this.v=v;
    }

    @Override
    public String toString() {
        return String.format("%c",v);

    }
}
