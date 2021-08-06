package Tree;

import java.util.Stack;

public class DFS {
    public static void dfs(TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            System.out.println(node.val);
            if(node.left!=null){
               stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }

        }

    }
    //递归版本
    public static void dfs2(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        dfs2(root.left);
        dfs2(root.right);
    }
}
