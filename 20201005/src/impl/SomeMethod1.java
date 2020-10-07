package impl;
//空树
//非空树（先从根找---找到了，返回；否则去左子树去找，再去右子树找
//


public class SomeMethod1 {

    //传入一个结点，判断这个结点在不在二叉树中

    public static boolean contains4(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node){
            return true;
        }
        boolean leftContains=contains4(root.left,node);
        if(leftContains){
            return true;
        }
        return contains4(root.right,node);
    }


    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        System.out.println(contains4(root,root));
        TreeNode a=new TreeNode('A');
        System.out.println(contains4(root,a));
    }

}
