package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        val=x;

    }


    @Override
    public String toString() {
        return "["+val+"]";
    }

    public static TreeNode stringToTreeNode(String input) {
        // 处理"[","]"
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        // 分割字符串，获取根结点
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        // 将根结点加入到双链表中
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        // 遍历双链表
        while (!nodeQueue.isEmpty()) {
            // 获取双链表的头结点作为当前结点
            TreeNode node = nodeQueue.remove();

            // 判断是否还有结点可以构建左子
            if (index == parts.length) {
                break;
            }

            // 构建当前结点的左子
            item = parts[index++];
            item = item.trim();
            // 判断左子是否为空
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                // 将左子加到双链表中
                nodeQueue.add(node.left);
            }

            // 判断是否还有结点可以构建右子
            if (index == parts.length) {
                break;
            }

            // 构建当前结点的右子
            item = parts[index++];
            item = item.trim();
            // 判断右子是否为空
            if (!item.equals("null")) {
                int rightNumber = Integer.valueOf(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }

        return root;
    }
}

