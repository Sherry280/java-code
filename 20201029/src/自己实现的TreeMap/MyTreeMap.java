package 自己实现的TreeMap;

public class MyTreeMap {
    public  TreeNode root;

    public  Integer put(String key,Integer value){
        if(root==null){
            root=new TreeNode(key,value);
            return null;
        }
        TreeNode current=root;
        TreeNode parent=null;
        while(current!=null){
            int comp=key.compareTo(current.key);
            if(comp==0){
                Integer oldValue=current.value;
                current.value=value;
                return oldValue;
            }else if(comp<0){
                parent=current;
                current=current.left;
            }else{
                parent=current;
                current=current.right;
            }
        }
        TreeNode node=new TreeNode(key,value);
        int comp=key.compareTo(parent.key);
        if(comp<0){
            parent.left=node;
        }else{
            parent.right=node;
        }
        return null;


    }

     Integer get(String key,Integer defaultValue){
        TreeNode current=root;
        while(current!=null){
            int comp=key.compareTo(current.key);
            if(comp==0){
                return current.value;
            }else if(comp<0){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return null;

    }
    public Integer getOrDefault(String key,Integer defaultValue){
        Integer v=get(key,0);
        if(v!=null){
            return v;
        }
        return defaultValue;
    }




}
