package impl;

public class SomeMethod {
    //提供一个二叉树，数出来有多少个结点
    //方法一：
    private static int n;
    public static int sumTreeNodeSize(TreeNode root){
        n=0;
        preOrder(root);
        return n;
    }
    public static void preOrder(TreeNode root){
        if(root!=null){
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //方法二：求根节点
    public static int sumTreeNodeSize2(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int rootNodeSize=1;
            int leftSubNodeSize=sumTreeNodeSize2(root.left);
            int rightSubNodeSize=sumTreeNodeSize2(root.right);

            return rootNodeSize+leftSubNodeSize+rightSubNodeSize;
        }
    }

    //给定一棵二叉树，求它的叶子结点个数
    //方法一：
    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root){
        leafN=0;
        preOrder1(root);
        return leafN;
    }
    public static void preOrder1(TreeNode root){
        if(root!=null){
            if(root.left==null&&root.right==null){
                leafN++;

            }
            preOrder1(root.left);
            preOrder1(root.right);
        }
    }
    //方法二：
    public static int sumLeafTreeNodeSize2(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;

        }else{
            int leftSumTreeLeafSize=sumLeafTreeNodeSize2(root.left);
            int rightSumTreeLeafSize=sumLeafTreeNodeSize2(root.right);

            return leftSumTreeLeafSize+rightSumTreeLeafSize;

        }

    }

    //给定一棵二叉树，求该二叉树第K层结点的个数
    public static int sumKLevelNodeSize(TreeNode root,int k){
        if(root==null){
            return 0;
        }else if(k==1){
            return 1;
        }else{
            int leftSubTreeK_1=sumKLevelNodeSize(root.left,k-1);
            int rightSubTreeK_1=sumKLevelNodeSize(root.right,k-1);

            return leftSubTreeK_1+rightSubTreeK_1;
        }
    }

    //给定一棵二叉树，求该二叉树的高度
    public static int getHeight(TreeNode root){
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        System.out.println("第一层结点的个数："+sumKLevelNodeSize(root,1));
        System.out.println("第2层结点的个数："+sumKLevelNodeSize(root,2));
        System.out.println("第3层结点的个数："+sumKLevelNodeSize(root,3));
        System.out.println("第4层结点的个数："+sumKLevelNodeSize(root,4));
        System.out.println("第5层结点的个数："+sumKLevelNodeSize(root,5));
        System.out.println("第6层结点的个数："+sumKLevelNodeSize(root,6));

//        int sum=sumLeafTreeNodeSize2(root);
//        System.out.println("树的叶子结点个数为："+sum);
//        int sum=sumTreeLeafNodeSize(root);
//        System.out.println("二叉树的叶子节点个数："+sum);



//        int sum=sumTreeNodeSize(root);
//        System.out.println(sum);
//
//
//        int sum2=sumTreeNodeSize2(root);
//        System.out.println(sum2);
    }
}
