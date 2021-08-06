package Tree;

import java.util.Stack;

public class InOrderTraversal {
    public static void inOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }
    //非递归遍历
    public static void inOrderTraversal2(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            if(!stack.isEmpty()){
                root=stack.pop();
                System.out.println(root.val);
                root=root.right;
            }
        }

    }
}
