package List;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList implements List {
    private int[] array;
    private int size;

    public ArrayList(){
        array=new int[10];
        size=0;

    }
    public ArrayList(List other){
        array=new int[other.size()];
        for(int i=0;i<other.size();i++){
            array[i]=other.get(i);

        }
        size=other.size();

    }
    //在指定位置添加元素
    @Override
    public boolean add(Integer e) {
        //扩容
        if(array.length==size){
            ensureCapacity(array.length*2);
        }
        //相当于尾插
        array[size++]=e;
        return true;
    }
    //调完这个方法后，保证容量一定是》=capacity

    public void ensureCapacity(int capacity){
        //检查是否需要搬家
        if(this.array.length>=capacity){
            return;
        }
        int[] newArray=new int[capacity];
        //从array数组中搬到newArray数组中
        for(int i=0;i<size;i++){
            newArray[i]=this.array[i];
        }
        //不再关联老的Array
        this.array=newArray;
    }


    //按下标添加元素
    @Override
    public void add(int index, Integer e) {
        //合法性校验
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("不合法的下标："+index);
        }
        //扩容2倍
        if(array.length==size){
            ensureCapacity(array.length*2);
        }
        //循环实现的效果是一样的
//        for(int i=size;i>index;i--){
//            array[i]=array[i-1];
//
//        }
        for(int i=size-1;i>=size;i--){
            array[i+1]=array[i];

        }
        array[index]=e;
        size++;


    }

    @Override
    public Integer remove(int index) {
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("下标不合法"+index);
        }
        int e=array[index];
        //从前往后删除
        //[index+1，size-1）的元素搬移到[index，size-2]的位置上
        for(int i=index;i<size;i++){
            array[i]=array[i+1];
        }
        size--;
        return e;

    }

    @Override
    public boolean remove(Integer e) {
//        for(int i=0;i<size;i++){
//            if(array[i]==e){
//                remove(i);
//                return true;
//            }
//        }
       // return false;
        int index=indexOf(e);
        if(index!=-1){
            remove(index);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Integer get(int index) {
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("下标不合法"+index);
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("下标不合法"+index);
        }
        Integer old=array[index];
        array[index]=e;
        return old;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        //-1暂时代表无效值
        Arrays.fill(array,-1);
        size=0;

    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e)!=-1;
    }

    @Override
    public int indexOf(Integer e) {
        for(int i=0;i<size;i++){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for(int i=size-1;i>=0;i--){
            if(array[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<size;i++){
            sb.append(array[i]);
            if(i!=size-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
