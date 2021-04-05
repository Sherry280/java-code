package Four4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}

/**
 * 使用面对对象的设计思想：
 * 进行层次遍历，将节点和层次数放到同一个同一个class中进行包装起来
 *
 */
public class Solution {
    class NL{
        TreeNode node;
        int level;
        NL(TreeNode node,int level){
            this.level=level;
            this.node=node;
        }
    }
    public  List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        //使用队列存储每一列的元素
        Queue<NL> queue=new LinkedList<>();
        queue.add(new NL(root,0));
        //队列里面现在不应该是只有根节点和层数信息吗？
        while(!queue.isEmpty()){
            //取出队列中的节点
            NL n1=queue.remove();
            //队列中的这个节点的两个属性：
            TreeNode node=n1.node;
            int level=n1.level;
            //如果使用层数进行控制输入的顺序的话，那么就要对层数进行判断
            if(level==list.size()&&level%2==0){
                list.add(new ArrayList<>());
            }
            List<Integer> innerList=list.get(level);
            innerList.add(node.val);

            if(node.left!=null){
                queue.add(new NL(node.left,level+1));
            }
            if(node.right!=null){
                queue.add(new NL(node.right,level+1));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.levelOrder(new TreeNode(5)));
    }
}
