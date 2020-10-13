package impl;

public class SameTree {
    //查找一棵树是否是另一棵树的子树
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return false;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val==q.val &&
                isSameTree(p.left,q.left)&&
                isSameTree(p.right,q.right);

    }
    public boolean isSubTree(TreeNode s,TreeNode t){
        return search(s,t);
    }

    public boolean search(TreeNode root,TreeNode t){
        if(root==null){
            return false;
        }
        if(root.val==t.val){
            if(isSameTree(root,t)){
                return true;
            }

        }
        if(search(root.left,t)){
            return true;
        }
       return search(root.right,t);
    }

    public static void main(String[] args) {
        SameTree sameTree=new SameTree();
        TreeNode p=new TreeNode('A');
        TreeNode q=new TreeNode('A');

        System.out.println(sameTree.isSubTree(p, q));
    }



}
