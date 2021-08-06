package Tree;

import static Tree.TreeNode.stringToTreeNode;

public class TestDemo {
    public static void main(String[] args) {
        String input="[1,2,4,5,3,6]";
        TreeNode root = stringToTreeNode(input);
        //PreOrder.preOrder(root);
        //InOrderTraversal.inOrderTraversal(root);
        //PostOrder.postOrder(root);
//        LevelOrder.levelOrder(root);
        DFS.dfs2(root);

    }
}
