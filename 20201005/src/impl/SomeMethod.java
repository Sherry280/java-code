package impl;

public class SomeMethod {
    //提供一个二叉树，数出来有多少个结点
    //方法一：
    private static int n;
    public static int sumTreeNodeSize(TreeNode root){
        n=0;
        preOrder(root);
        return n;
    }
    public static void preOrder(TreeNode root){
        if(root!=null){
            n++;
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //方法二：求根节点
    public static int sumTreeNodeSize2(TreeNode root){
        if(root==null){
            return 0;
        }else{
            int rootNodeSize=1;
            int leftSubNodeSize=sumTreeNodeSize2(root.left);
            int rightSubNodeSize=sumTreeNodeSize2(root.right);

            return rootNodeSize+leftSubNodeSize+rightSubNodeSize;
        }
    }

    //给定一棵二叉树，求它的叶子结点个数
    //方法一：
    private static int leafN;
    public static int sumTreeLeafNodeSize(TreeNode root){
        leafN=0;
        preOrder1(root);
        return leafN;
    }
    public static void preOrder1(TreeNode root){
        if(root!=null){
            if(root.left==null&&root.right==null){
                leafN++;

            }
            preOrder1(root.left);
            preOrder1(root.right);
        }
    }
    //方法二：
    public static int sumLeafTreeNodeSize2(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;

        }else{
            int leftSumTreeLeafSize=sumLeafTreeNodeSize2(root.left);
            int rightSumTreeLeafSize=sumLeafTreeNodeSize2(root.right);

            return leftSumTreeLeafSize+rightSumTreeLeafSize;

        }

    }

    //给定一棵二叉树，求该二叉树第K层结点的个数
    public static int sumKLevelNodeSize(TreeNode root,int k){
        if(root==null){
            return 0;
        }else if(k==1){
            return 1;
        }else{
            int leftSubTreeK_1=sumKLevelNodeSize(root.left,k-1);
            int rightSubTreeK_1=sumKLevelNodeSize(root.right,k-1);

            return leftSubTreeK_1+rightSubTreeK_1;
        }
    }

    //给定一棵二叉树，求该二叉树的高度
    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;
        }else{
            int leftSubTreeHeight=getHeight(root.left);
            int rightSubTreeHeight=getHeight(root.right);

            return Math.max(leftSubTreeHeight,rightSubTreeHeight)+1;
        }
    }
    //给定一棵二叉树，同时给定一个V，问这棵二叉树是否包含这个V。
    public static boolean contains1(TreeNode root,int v){
        if(root==null){
            return false;
        }else{
            if(root.v==v){
                return true;
            }else{
                boolean leftSubTreeContains=contains1(root.left,v);
                if(leftSubTreeContains){
                    return true;
                }else{
                    boolean rightSubTreeContains=contains1(root.right,v);
                    if(rightSubTreeContains){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
    }


    //查找V，返回包含V所在的这个结点,如果没有找到，则返回null
    public static TreeNode contains3(TreeNode root,int v){
        if(root==null){
            return null;
        }
        if(root.v==v){
            return root;//返回根节点
        }

        TreeNode leftContains=contains3(root.left,v);
        //如何根据leftContains判断是否找到了V
        if(leftContains!=null){//找到了返回结点，没有找到返回Null
            return leftContains;
            //不是返回root.left.
        }
        //左子树没有找到，则去右子树去找
//        TreeNode rightContains=contains3(root.right,v);
//        if(rightContains!=null){
//            return rightContains;
//        }
        return contains3(root.right,v);

    }

    //
//    public static TreeNode contains4(TreeNode root,TreeNode node){
//
//    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        TreeNode a=contains3(root,'A');
        System.out.println(a);
        System.out.println(contains3(root,'G'));
        System.out.printf("%c%n",a.v);

//        System.out.println(contains1(null,'A'));
//        System.out.println(contains1(new TreeNode('A'),'A'));
//        System.out.println(contains1(root,'A'));



       // System.out.println("树的高度为："+getHeight(root));


//        System.out.println("第一层结点的个数："+sumKLevelNodeSize(root,1));
//        System.out.println("第2层结点的个数："+sumKLevelNodeSize(root,2));
//        System.out.println("第3层结点的个数："+sumKLevelNodeSize(root,3));
//        System.out.println("第4层结点的个数："+sumKLevelNodeSize(root,4));
//        System.out.println("第5层结点的个数："+sumKLevelNodeSize(root,5));
//        System.out.println("第6层结点的个数："+sumKLevelNodeSize(root,6));

//        int sum=sumLeafTreeNodeSize2(root);
//        System.out.println("树的叶子结点个数为："+sum);
//        int sum=sumTreeLeafNodeSize(root);
//        System.out.println("二叉树的叶子节点个数："+sum);



//        int sum=sumTreeNodeSize(root);
//        System.out.println(sum);
//
//
//        int sum2=sumTreeNodeSize2(root);
//        System.out.println(sum2);
    }
}
