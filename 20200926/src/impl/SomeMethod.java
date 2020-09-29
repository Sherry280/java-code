package impl;

public class SomeMethod {
    private static int n;


    public static void preOrder(TreeNode root) {
        if (root != null) {
            n++;
            preOrder(root.right);
            preOrder(root.left);
        }
    }

    public static int sumTreeNodeSize(TreeNode root) {
            return 0;

    }
}
