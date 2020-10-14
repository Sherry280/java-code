import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.Enumeration;
import java.util.LinkedList;


public class Operation {

//    Node head;
//
//
//    public static Node addFirst(Node head,int e){
//        Node newHead=head;
//        if(head==null){
//            return null;
//        }
//        head.next=newHead;
//        return newHead;
//
//
//    }
//
//    public static Node addLast(Node head,int e){
//
//    }
//    public static Node del(Node head){
//
//    }
//    public static Node last(Node head){
//
//
//    }

    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSize=getHeight(root);
        int rightSize=getHeight(root);
        return Math.max(leftSize,rightSize)+1;
    }



    public static TreeNode levelTraversal(TreeNode root){
        if(root==null){
            return null;
        }

        Deque<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode top=queue.remove();
            System.out.printf("%c%n",top);

        }
        return null;

    }






}
