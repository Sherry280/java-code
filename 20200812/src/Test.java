
class Node{
    public Node next;
    public int data;
    public Node(int data){
        this.data=data;
    }
}

public class Test{

    public Node merge(Node list1,Node list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        Node mergeHead=null;
        Node current=null;
        while(list1!=null&&list2!=null){
            if(list1.data<=list2.data){
                if(mergeHead==null){
                    mergeHead=current=list1;

                }else{
                    current.next=list1;
                    current=current.next;
                }
                list1=list1.next;


            }else{
                if(mergeHead==null){
                    mergeHead=current=list2;
                }else{
                    current.next=list2;
                    current=current.next;
                }
                list2=list2.next;

            }
        }
        if(list1==null){
            current.next=list2;

        }else{
            current.next=list1;
        }
        return mergeHead;
    }


    public static void main(String[] args) {
        Test test=new Test();
        Node ret=test.merge(null,null);
        System.out.println(ret);
    }





//    private static int i = 1;
//    public int getNext(){
//        return i++;
//    }
//    public static void main(String [] args){
//        Test test=new Test();
//        Test testObject=new Test();
//        test.getNext();
//        testObject.getNext();
//        System.out.println(testObject.getNext());
//    }
}







