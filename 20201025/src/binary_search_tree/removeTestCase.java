package binary_search_tree;

public class removeTestCase {
    //专门写测试用例
    //有14个测试用例
    //1.删除的key不在BST中
    public static void case1(){
        BST bst=new BST();
        bst.insert(5);
        System.out.println(bst.remove(4));
    }

    //2.只有一个节点的BST，删除该节点
    public static void case2(){
        BST bst=new BST();
        bst.insert(3);
        boolean remove=bst.remove(3);
        System.out.println(remove);

    }
    //3.删除一个叶子结点，其是双亲的左孩子
    public static void case3(){
        BST bst=new BST();

        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(2);

        boolean remove=bst.remove(2);
        System.out.println(remove);
    }
    //4.删除一个叶子结点，其是双亲的右孩子
    public static void case4(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        boolean remove=bst.remove(6);
        System.out.println(remove);
    }

    //5.删除根，但根没有右孩子
    public static void case5(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(3);
        System.out.println(bst.remove(5));
    }
    //6.删除根，但根没有左孩子
    public static void case6(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(7);
        bst.insert(6);
        //bst.insert(2);
        boolean remove=bst.remove(5);
        System.out.println(remove);

    }
    //7.删除一个没有右孩子的结点，其是双亲结点的左孩子
    public static void case7(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
        bst.insert(2);
        System.out.println(bst.remove(3));
    }
    //8.删除一个没有右孩子的结点，其是双亲节点的孩右子
    public static void case8(){
        BST bst=new BST();
        bst.insert(6);
        bst.insert(5);
        bst.insert(4);
        System.out.println(bst.remove(6));
    }
    //9.删除一个没有左孩子的结点，其是双亲节点的左孩子
    public static void case9(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(4);
        System.out.println(bst.remove(3));
    }
    //10.删除一个没有左孩子的结点，其是双亲节点的右孩子
    public static void case10(){
        BST bst=new BST();
        bst.insert(4);
        bst.insert(3);
        bst.insert(6);
        //bst.insert(5);
        bst.insert(7);
        System.out.println(bst.remove(6));
    }
    //11.替换法的情况一：node的左孩子没有右孩子
    public static void case11(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        //bst.insert(4);
        bst.insert(2);
        boolean remove=bst.remove(3);
        System.out.println(remove);
    }
    //12.替换法的情况2：node的左孩子有右孩子
    public static void case12(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(4);
        bst.insert(2);
        boolean remove=bst.remove(3);
        System.out.println(remove);
    }

    //13.替换法  试着删除根的情况
    public static void case13(){
        BST bst=new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(4);
        bst.insert(2);
        boolean remove=bst.remove(5);
        System.out.println(remove);
    }
    //14.空树  删除
    public static void case14(){
        BST bst=new BST();
        System.out.println(bst.remove(7));

    }

    public static void main(String[] args) {
        case11();
    }
}
