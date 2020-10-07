package leetcode;
import impl.BuildTree;
import impl.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    //之前的打印
    public void preorderPrint(TreeNode root){
        if(root!=null){
            System.out.printf("%c",root.v);
            preorderPrint(root.left);
            preorderPrint(root.right);

        }
    }
    //遍历二叉树，并以List返回
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        if(root!=null){
            //将根节点放进去
            list.add(root.v);
            List<Integer> leftSubTreeList = preorderTraversal(root.left);
            list.addAll(leftSubTreeList);

            List<Integer> rightSubTreeList = preorderTraversal(root.right);
            list.addAll(rightSubTreeList);

        }
        return list;

    }

    public static void main(String[] args) {
        TreeNode root= BuildTree.buildTree1();
        Solution1 s=new Solution1();
        System.out.println(s.preorderTraversal(root));
    }
}
