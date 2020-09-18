package List;

public interface List {
    boolean add(Integer e);
    void add(int index,Integer e);
    //根据下标删除
    Integer remove(int index);
    //删除遇到第一个
    boolean remove(Integer e);
    Integer get(int index);
    Integer set(int index,Integer e);
    int size();
    void clear();
    boolean isEmpty();
    boolean contains(Integer e);
    int indexOf(Integer e);
    int lastIndexOf(Integer e);










}
