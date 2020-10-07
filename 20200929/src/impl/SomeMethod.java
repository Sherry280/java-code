package impl;



public class SomeMethod {
    //返回root为根的树中，有多少个结点
    private static int n;


    public static int sumTreeNodeSize(TreeNode root){
        int n=0;//局部变量  方法期间有效  每次数之前，都要将n归为0

        preOrder(root);

        return n;
    }
    //根+左子树+右子树
    public static int sumTreeNodeSize2(TreeNode root){
        //空指针异常
        //
        if(root==null){
            return 0;
        }else {
            int rootNodeSize = 1;
            int leftSubTreeNodeSize = sumTreeNodeSize2(root.left);
            int rightSubTreeNodeSize = sumTreeNodeSize2(root.right);

            return rootNodeSize + leftSubTreeNodeSize + rightSubTreeNodeSize;
        }
    }

    private static void preOrder(TreeNode root){
        //1.一个树的节点（root!=null）2.没有节点(root==null)
        //只需要关注情况1即可
        if(root!=null){
            //处理根的时候不打印，而是让
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }




    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        int sum=sumTreeNodeSize2(root);
        System.out.println("树中的结点个数为:"+sum);
    }
}
