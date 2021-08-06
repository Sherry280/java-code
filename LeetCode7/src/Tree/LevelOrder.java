package Tree;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        //链表，在这里我们可以把它看成是一个队列
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(root);//把元素添加到队尾
        while(!list.isEmpty()){
            //移除队头元素
            TreeNode node=list.poll();
            System.out.println(node.val);
            if(node.left!=null){
                list.add(node.left);
            }
            if(node.right!=null){
                list.add(node.right);
            }
        }
    }

    //递归版本的
    public static void levelOrder2(TreeNode root){
        int depth=GetHeight(root);
        for(int level=0;level<depth;level++){
            printLevel(root,level);
        }
    }
    public static void printLevel(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(level==0) {
            System.out.println(root.val);
        }else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }
    public static int GetHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHigh=GetHeight(root.left);
        int rightHigh=GetHeight(root.right);
        return Math.max(leftHigh,rightHigh)+1;
    }


    //如果想把遍历的结果放到list中存储
    public static List<List<Integer>> levelOrder3(TreeNode root){
        if(root==null){
            return null;
        }
        List<List<Integer>> list=new ArrayList<>();
        bfs(root,0,list);
        return list;
    }
    public static void bfs(TreeNode root,int level,List<List<Integer>> list){
        if(root==null){
            return;
        }

        if(level>list.size()){
            List<Integer> subList=new ArrayList<>();
            subList.add(root.val);
            list.add(subList);
        }else{
            list.get(level).add(root.val);
        }
        bfs(root.left,level+1,list);
        bfs(root.right,level+1,list);

    }
}
