package Five5;

import Four4.TestDemo;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
    public TreeNode left=null;
    TreeNode right=null;
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}
public class TestDemo1 {
    /**
     * 之字形遍历打印二叉树的各个节点
     * 使用两个栈来进行存储和打印
     *
     */
    public static ArrayList<ArrayList<Integer>> Print(TreeNode root){
        int layer=1;
        //s1存储奇数层的节点
        Stack<TreeNode> s1=new Stack<>();
        s1.push(root);
        //s2存储偶数层节点
        Stack<TreeNode> s2=new Stack<>();

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        while(!s1.empty()||!s2.empty()){
            if(layer%2!=0){
                ArrayList<Integer> tmp=new ArrayList<>();
                while(s1.isEmpty()){
                    TreeNode node=s1.pop();
                    if(node!=null){
                        tmp.add(node.val);
                        System.out.print(node.val+" ");
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if(!tmp.isEmpty()){
                    list.add(tmp);
                    layer++;
                    System.out.println();
                }
            }else{
                ArrayList<Integer> tmp=new ArrayList<>();
                while(!s2.empty()){
                    TreeNode node=s2.pop();
                    if(node!=null){
                        tmp.add(node.val);
                        System.out.print(node.val+" ");
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if(!tmp.isEmpty()){
                    list.add(tmp);
                    layer++;
                    System.out.println();

                }
            }
        }
        return list;
    }
    public static ArrayList<ArrayList<Integer>> Print3(TreeNode pRoot) {
        int layer = 1;
        //s1存奇数层节点
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(pRoot);
        //s2存偶数层节点
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        while (!s1.empty() || !s2.empty()) {
            if (layer%2 != 0) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if(node != null) {
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if(node != null) {
                        temp.add(node.val);
                        System.out.print(node.val + " ");
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    layer++;
                    System.out.println();
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(Print(new TreeNode(4)));

    }
}
