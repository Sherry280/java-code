package First1;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class TestDemo {
    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
    //使用异或进行计算
        public static  int[] FindNumsAppearOnce (int[] array) {
            int xor = array[0];
            for (int i = 1; i < array.length; ++i) {
                xor ^= array[i];
            }
            // 寻找二进制中最右边的 1
            xor -= xor & (xor - 1);
            int[] res = new int[2];
            for (int i = 0; i < array.length; ++i) {
                // 根据他们是 1 还是 0，来分配在数组 res 中的位置
                if ((xor & array[i]) == 0) res[0] ^= array[i];
                else res[1] ^= array[i];
            }
            // 排序
            if (res[0] > res[1]) {
                int temp = res[0];
                res[0] = res[1];
                res[1] = temp;
            }
            return res;
        }


    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        //退出的时候只有2种情况：
        //1.正常退出
        //2.上面情况不满足的情况退出
        if(fast==null||fast.next==null){
            return null;
        }
        slow=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }



    public ListNode FindFirstCommonNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) {
            return null;
        }
        //分别求出两个链表的长度，让长的链表先走两个链表的差值步
        //两个引用同时走，如果他们相遇了，则返回相交的这个节点
        int lenA=0;
        int lenB=0;
        ListNode pl=headA;
        ListNode ps=headB;
        while(pl!=null){
            lenA++;
            pl=pl.next;//pl走到了最后
        }
        while(ps!=null){
            lenB++;
            ps=ps.next;
        }
        int len=lenA-lenB;
        pl=headA;
        ps=headB;
        if(len<0){
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        //长的先走pl步
        while(len>0){
            len--;
            pl=pl.next;
        }
        while(pl!=ps&&pl!=null&&ps!=null){
            pl=pl.next;
            ps=ps.next;
        }
        if(pl==ps&&pl!=null){
            return pl;
        }
        return null;
    }

    public static void main(String[] args) {
            int[] array={1,4,5,6,6,5,4,1,9,7};
        System.out.println(Arrays.toString(FindNumsAppearOnce(array)));

    }
    

}
