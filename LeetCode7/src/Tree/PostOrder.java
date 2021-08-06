package Tree;

import java.util.Stack;

public class PostOrder {
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    //非递归版本
    public static void postOrder2(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            s2.push(root);
            while(root.left!=null){
                s1.push(root.left);
            }
            while(root.right!=null){
                s1.push(root.right);
            }
        }
        while(!s2.isEmpty()){
            System.out.println(s2.pop().val+" ");
        }
    }

    public static void postOrder3(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();

    }
}
