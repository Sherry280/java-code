package leetcode;
import impl.BuildTree;
import impl.TreeNode;

//判断两棵二叉树是否为相同的树
//意思就是结构相同，结点的值相同

public class Solution2 {
    public static boolean isSameTree1(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return q.v==p.v
                && isSameTree(p.left,q.left)
                && isSameTree(p.right,q.right);
    }
    //判断一棵二叉树是否互为镜像对称
    public static boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isMirrorTree(root.left,root.right);
    }
    public static boolean isMirrorTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.v==q.v
                && isMirrorTree(p.left,q.right)
                && isMirrorTree(p.right,q.left);

    }


    //检查一棵二叉树是否为另一棵二叉树的子树
    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.v==q.v
                && isSameTree(p.left,q.left)
                && isSameTree(p.right,q.right);

    }
    public static boolean isSubTree(TreeNode s,TreeNode t){
        return search(s,t);

    }
    public static boolean search(TreeNode root,TreeNode t){
        //根为空
        if(root==null){
            return false;
        }
        //现在在根中找，如果t的值和root相等，再继续向下判断

        if(root.v==t.v){
            if(isSameTree(root,t)){
                return true;
            }
        }
        if(search(root.left,t)){
            return true;
        }
        return search(root.right,t);
    }

    //求一棵二叉树的最大深度
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }

    //判断一棵二叉树是否为平衡二叉树
    public static boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        int leftSubTree=maxDepth(root.left);
        int rightSubTree=maxDepth(root.right);
        int diff=leftSubTree-rightSubTree;
        if(!(diff==-1||diff==0||diff==1)){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);

    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        System.out.println(isBalanced(root));
        //System.out.println(maxDepth(root));


//        System.out.println(isSymmetric(root));


        TreeNode p=BuildTree.buildTree2();
        TreeNode q=BuildTree.buildTree3();
        System.out.println(isSubTree(p, q));
//

       //System.out.println(isSameTree(p, q));




    }






}



