package Test0802;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val=x;
    }
}
public class Solution2 {
    /**
     *二叉树求解到目标值target距离为k的节点
     */
    public void findK(TreeNode target,int k,List<Integer> list ){
        if(target==null){
            return;
        }
        if(k==0){
            list.add(target.val);
            return;
        }
        findK(target.left,k-1,list);
        findK(target.right,k-1,list);
    }
    //将目标值target节点到根节点root之间的指向进行翻转
    public TreeNode  reverseTree(TreeNode root,TreeNode target,TreeNode p){
        if(root==null){
            return null;
        }
        if(target==root){
            //进行逆转到根节点root之间的指向
            target.left=p;
            target.right=null;
            return target;
        }
        TreeNode l=reverseTree(root.left,target,root);
        if(l!=null){
            root.left=p;
            return root;
        }

        TreeNode r=reverseTree(root.right,target,root);
        if(r!=null){
            root.right=p;
            return root;

        }
        return null;



    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list=new ArrayList<>();
        //1.先找到目标值target的子树中相距为k的节点
        findK(target,k,list);
        if(k==0){
            return list;
        }
        //2.将target到root的节点，指向反转
        reverseTree(root,target,null);
        //3.再以target为根节点，进行查找其子树中距离target为k的节点
        findK(target,k,list);
        return list;



    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(6);
        TreeNode a=new TreeNode(2);
        TreeNode b=new TreeNode(3);
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(4);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        Solution2 s=new Solution2();
        System.out.println(s.distanceK(root, a, 1));
    }


}
