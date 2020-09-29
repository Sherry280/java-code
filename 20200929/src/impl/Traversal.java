package impl;

public class Traversal {
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.printf("%c", root.v);
            preOrder(root.left);
            preOrder(root.right);
        }

    }
        //加括号的前序遍历
    public static void preOrder2(TreeNode root) {
        if (root != null) {
            System.out.printf("%c", root.v);
            System.out.print(" { ");
            preOrder2(root.left);
            System.out.print("}  {");
            preOrder2(root.right);
            System.out.print(" }");
        }

    }

    //中序遍历
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.printf("%c", root.v);
            inOrder(root.right);

        }
    }

    //后序遍历
    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%c", root.v);
        }
    }

    public static void main(String[] args) {
       TreeNode a=BuildTree.buildTree1();
        preOrder2(a);

    }


}
