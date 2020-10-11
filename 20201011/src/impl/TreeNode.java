package impl;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        x=val;
    }

    @Override
    public String toString() {
        return
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
