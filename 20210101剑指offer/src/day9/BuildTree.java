package day9;

public class BuildTree {
        public static TreeNode buildTree1(){
            TreeNode a=new TreeNode('8');
            TreeNode b=new TreeNode('6');
            TreeNode c=new TreeNode('9');
            TreeNode d=new TreeNode('5');
            TreeNode e=new TreeNode('7');
            TreeNode f=new TreeNode('3');
            TreeNode g=new TreeNode('0');
            TreeNode h=new TreeNode('1');
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
}
