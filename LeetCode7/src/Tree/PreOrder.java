package Tree;

import java.util.Stack;

public class PreOrder {
    //前序遍历  递归写法
    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //前序遍历  非递归写法
    //非递归写法，先把二叉树的右子树节点放入栈中，然后压入左节点，
    public static void preOrder2(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode q=stack.pop();
            System.out.println(q.val+" ");
            //先把右节点压入栈中
            if(q.right!=null){
                stack.push(q.right);
            }
            //再压入左节点
            if(q.left!=null){
                stack.push(q.left);
            }
        }

    }
}
