package impl;

public class BuildTree {
    public static TreeNode buildTree1(){
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
        return a;
    }

    public static TreeNode buildTree2(){
        TreeNode a=new TreeNode('A');
        TreeNode b=new TreeNode('B');
        TreeNode c=new TreeNode('C');
        TreeNode d=new TreeNode('D');

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=null;
        c.left=null;
        c.right=null;
        d.left=null;
        d.right=null;

        return a;
    }

    public static TreeNode buildTree3(){
        TreeNode a=new TreeNode('A');
        TreeNode b=new TreeNode('B');
        TreeNode c=new TreeNode('C');

        a.left=b;
        a.right=c;
        b.left=null;
        b.right=null;
        c.left=null;
        c.right=null;

        return a;
    }


}
