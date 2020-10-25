package binary_search_tree;

public class Node {
     Integer key;
    Node right;
    Node left;

    Node(Integer key){
        this.key=key;
    }

    @Override
    public String toString() {
        return "Node{"+"key="+key+'}';
    }
}
