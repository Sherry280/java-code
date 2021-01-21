package day20;


import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



public class Plus {
    /**
     * 链表中的元素相加，返回一个链表
     */
    public ListNode plusAB(ListNode a, ListNode b) {
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }

        ListNode cur=new ListNode(-1);
        int sum=0;

        int carry=0;
        while(a!=null||b!=null){
            int x=a!=null?a.val:0;
            int y=b!=null?b.val:0;
            sum=x+y+carry;
            carry=sum/10;

            a=a.next;
            b=b.next;


        }
        if(carry>0){
            cur.next=new ListNode(carry);
        }
        return cur.next;


    }

    public static void main(String[] args) {
        


    }
}
