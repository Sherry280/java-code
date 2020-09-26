package impl;

import sun.reflect.generics.tree.Tree;

public class TreeTraversal {



    // 前序遍历
    public static void preOrderTraversal(TreeNode root){
        if(root!=null){
            //根节点
            System.out.printf("%c",root.v);
            //遍历左结点
            preOrderTraversal(root.left);
            //遍历右子树
            preOrderTraversal(root.right);
        }else{
            //什么都不打印
        }


    }
    // 中序遍历
    static void inOrderTraversal(TreeNode root){
        //只要传入了结点进来
        if(root!=null){
            //中序遍历左子树
            inOrderTraversal(root.right);
            //处理根节点
            System.out.printf("%c",root.v);
            //中序遍历左子树
            inOrderTraversal(root.left);

        }

    }
    // 后序遍历
    static void postOrderTraversal(TreeNode root){
        if(root!=null){
            //左右根
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.printf("%c",root.v);

        }

    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode('A');
        TreeNode b=new TreeNode('B');
        TreeNode c=new TreeNode('C');
        TreeNode d=new TreeNode('D');
        TreeNode e=new TreeNode('E');
        TreeNode f=new TreeNode('F');
        TreeNode g=new TreeNode('G');
        TreeNode h=new TreeNode('H');
        TreeNode i=new TreeNode('I');
        TreeNode j=new TreeNode('J');



        a.left=b;
        a.right=c;

        b.left=d;
        b.right=null;

        c.right=f;
        c.left=e;

        d.left=null;
        d.right=g;

        e.left=null;
        e.right=null;

        f.left=h;
        f.right=i;

        g.right=null;
        g.left=j;

        h.right=null;
        h.left=null;

        i.right=null;
        i.left=null;

        j.left=null;
        j.right=null;

        System.out.println("前序遍历：");
        preOrderTraversal(a);

        System.out.println("中序遍历：");
        inOrderTraversal(a);
        System.out.println("后序遍历：");
        postOrderTraversal(a);



    }



}
