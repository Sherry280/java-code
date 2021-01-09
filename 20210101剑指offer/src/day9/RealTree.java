package day9;

class Tree{
    public Tree left=null;
    public Tree right=null;
    public int value=0;
    public Tree(int value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
public class RealTree {
    public static Tree SortBinaryTree(Tree node,int i){


        if(node == null){
            node = new Tree(i);
            return node;
        }
        else{
            if(i <= node.value){

                node.left =  SortBinaryTree(node.left, i);
            }
            else{
                node.right = SortBinaryTree(node.right,i);
            }

            return node;
        }

    }

    public static void main(String[] args) {
        int shuzu []= {3,1,2,5,0,7,9,8};
        Tree tree = new Tree(shuzu[0]);    //以3这个数为根节点
        for( int i = 1 ; i < shuzu.length ; i ++){

            SortBinaryTree(tree, shuzu[i]);
        }
    }
}
