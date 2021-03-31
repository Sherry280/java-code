package Second2;



class TreeNode{
    TreeNode root;
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val=val;
    }

}
public class TestDemo {
    //4.求二叉树的高度
    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
            int left=getHeight(root.left);
            int right=getHeight(root.right);
            return Math.max(left,right);

    }
    //3.给定一颗二叉树，求该二叉树第k层的结点的个数
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




    //2.求叶子节点的个数
    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root){
        leafN=0;
        preOrder2(root);
        return leafN;

    }
    public static void preOrder2(TreeNode root){
        if(root!=null){
            if(root.left==null&&root.right==null){
                leafN++;
            }
            preOrder2(root.left);
            preOrder2(root.right);
        }
    }



    //1.二叉树的数结点个数
    private static int n;
    public static int sumTreeNode(TreeNode root){
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
    public static void main(String[] args) {
        System.out.println(sumKLevelNodeSize(new TreeNode(3), 1));

    }
}
