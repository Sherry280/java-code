package impl;

public class SomeMethod1 {
    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root){
        leafN=0;
        preOrder2(root);
        return leafN;
    }

    private static void preOrder2(TreeNode root){
        if(root!=null){
            if(root.left==null&&root.right==null){
                leafN++;

            }
            preOrder2(root.left);
            preOrder2(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        int sum=sumTreeLeafNodeSize(root);
        System.out.println("树的叶子节点个数："+sum);
    }

}
