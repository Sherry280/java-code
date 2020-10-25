package binary_search_tree;

public class BST {

    private Node root;
    public BST(){
        root=null;
    }

    //查找key是否存在
    public boolean search(Integer key){
        Node current=root;
        while(current!=null){
            int comp=key.compareTo(current.key);//key-current.key==0
            if(comp==0){
                return true;
            }else if(comp<0){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return false;

    }

    //插入
    public void insert(Integer key){
        if(root==null){
             root=new Node(key);
            return;
        }
        //根不为空
        Node parent=null;
        Node current=root;
        int cmp=0;
        while (current!=null){
            cmp=key.compareTo(current.key);
            if(cmp==0){
                throw new RuntimeException("SCT中不允许出现重复的值！");
            }else if(cmp<0){
                parent=current;
                current=current.left;
            }else{
                parent=current;
                current=current.right;

            }

        }
        //走到这，current一定为空
        Node node=new Node(key);
        if(cmp<0){
            parent.left=node;
        }else{
            parent.right=node;
        }

    }
    //删除操作


}
