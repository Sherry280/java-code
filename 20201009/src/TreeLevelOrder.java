import java.util.Queue;
import java.util.LinkedList;
public class TreeLevelOrder {
    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.remove();
            System.out.println(node.val);
            if(node.left!=null){
                queue.add(node.left);

            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root=BuildTree.buildTree1();
        levelOrderTraversal(root);
    }
}
