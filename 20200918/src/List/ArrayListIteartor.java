package List;

public class ArrayListIteartor implements Iterator{
    //对一个顺序表做迭代，关键是控制下标
    private ArrayList list;//我们要遍历的顺序表
    private int index;//我们在顺序表的哪个位置

    // 构造方法
    ArrayListIteartor(ArrayList list){
        this.list=list;
        this.index=0;
    }


    @Override
    public boolean hasNext() {
        return index<list.size();
    }
    //1.返回迭代器当前的位置
    //2.让迭代器走到下一个位置上
    @Override
    public Integer next() {
        return list.get(index++);
    }

    @Override
    public void remove() {

    }
}
