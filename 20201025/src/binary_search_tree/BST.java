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
    public boolean remove(Integer key){
        //找要删除的结点key所在的结点为node，node的双亲结点，记作parent
        Node current=root;
        Node parent=null;
        while(current!=null){
            int comp=key.compareTo(current.key);
            if(comp==0){
                removeInternal(current,parent);
                return true;
            }else if(comp<0){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return false;
    }
    private void removeInternal(Node node,Node parent){
        //总共有四种情况：1.两边都没有左右孩子 2.只有一边有孩子  3.两边都有子孩子

        //node为要删除的结点
        if(node.left==null&&node.left==null){
            if(node==root){
                root=null;
            }else if(node==parent.left){
                parent.left=null;
            }else{
                parent.right=null;
            }
        }else if(node.left!=null&&node.right==null){
            //有左节点，没有右节点

            if(node==root){
                root=node.left;

            }else if(node==parent.left){
                parent.left=node.left;
            }else{
                parent.right=node.left;
            }
        }else if(node.left==null&&node.right!=null){
            if(node==root){
                root=node.right;
            }else if(node==parent.left){
                parent.left=node.right;
            }else{
                parent.right = node.right;
            }
        }else{
            //左右孩子都有的时候
            Node ghost=node.left;
            Node ghostParent=null;
            while(ghost.right!=null){
                ghostParent=ghost;
                ghost=ghost.right;
            }
            //进行替换
            node.key=ghost.key;
            //删除ghost结点（其有孩子一定为空）
            if(node==ghostParent){
                ghostParent.left=ghost.left;
            }else{
                ghostParent.right=ghost.left;
            }
        }
    }



}
