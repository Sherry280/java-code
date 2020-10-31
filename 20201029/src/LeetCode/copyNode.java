package LeetCode;

import javax.swing.tree.TreeNode;

public class copyNode {
    //普通链表的复制
    public static Node1 copy(Node1 head) {
        //Node1 newHead=new Node1(-1);
        Node1 newHead = new Node1(-1);
        Node1 newLast = newHead;
        Node1 current = head;

        while (current != null) {
            Node1 newNode = new Node1(current.val);
            //进行尾插
            newLast.next = newNode;
            newLast = newNode;

            current = current.next;


        }
        return newHead.next;
    }


}
