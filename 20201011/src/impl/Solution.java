package impl;
import java.util.*;

/**
 * 根据前序遍历和中序遍历，还原出来二叉树
 */


public class Solution {
    //将数组转化为List
    private List<Integer> intArrayTOList(int[] array){
        List<Integer> list=new ArrayList<>();
        for(int e:array){
            list.add(e);
        }
        return list;

    }




    //传进来一个前序遍历和中序遍历
    private TreeNode buildTreeInternal(List<Integer> preorderList,List<Integer> inorderList){
       if(inorderList.isEmpty()){
           return null;
       }
       int rootVal=preorderList.get(0);
       TreeNode root=new TreeNode(rootVal);
       if(preorderList.size()==1){
           return root;
       }
       int leftSize=inorderList.indexOf(rootVal);
       //切割
        //左子树的前序遍历和右子树的前序遍历
        List<Integer> leftPre=preorderList.subList(1,1+leftSize);
        List<Integer> rightPre=preorderList.subList(1+leftSize,preorderList.size());


        //左子树的中序遍历和右子树的中序遍历
        List<Integer> leftIn=inorderList.subList(0,leftSize);
        List<Integer> rightIn=inorderList.subList(leftSize+1,inorderList.size());

        //分别再去构建左右子树
        root.left=buildTreeInternal(leftPre,leftIn);
        root.right=buildTreeInternal(rightPre,rightIn);

        return root;




    }

    //传进来一个前序遍历和中序遍历的数组
    public TreeNode buildTree(int[] preorder,int[] inorder){
        List<Integer> preorderList=intArrayTOList(preorder);
        List<Integer> inorderList=intArrayTOList(inorder);
        System.out.println(preorderList);
        System.out.println(inorderList);

        return buildTreeInternal(preorderList,inorderList);

        
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

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;
        e.right=h;


        Solution s=new Solution();
        int[] preorder={'a','b','c','d','e','g','f'};
        int[] inorder={'c','b','e','g','d','f','a'};
        List<Integer> preorderList=s.intArrayTOList(preorder);
        List<Integer> inorderList=s.intArrayTOList(inorder);
        //s.buildTree(preorder,inorder);

        System.out.println(s.buildTreeInternal(preorderList, inorderList));


    }


}
