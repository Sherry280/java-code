package generic.type;

import java.util.*;

public class MyArray<E> implements List<E> {

    private E[] array;
    private int size;
    //实现一个构造方法
    public MyArray(){
        //无法直接定义泛型数组，所以只能定义Object类型数组，然后强转
        array=(E[])new Object[10];


    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o)!=-1;
    }

    @Override
    public Iterator<E> iterator() {
        throw new RuntimeException("不支持的方法");
    }

    @Override
    public Object[] toArray() {
        Object[] a=new Object[size];
        for(int i=0;i<size;i++){
            a[i]=array[i];
        }
        return a;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if(a.length<size){
            //船舰一个数组直接返回
            T[] newArray=(T[])new Object[size];
            for(int i=0;i<size;i++){
                newArray[i]=(T) array[i];

            }
            return newArray;
        }else if(a.length==size){
            for(int i=0;i<size;i++){
                a[i]=(T)array[i];

            }
            return a;

        }else{
           for(int i=0;i<size;i++){
                a[i]=(T)array[i];

            }
            a[size]=null;
            return a;


        }
    }

    @Override
    public boolean add(E e) {
        //Todo:没有考虑扩容
         array[size++]=e;
         return true;
    }

    @Override
    public boolean remove(Object o) {
       int i=indexOf(o);
       if(i==-1){
           return false;
       }else{
           remove(i);
           return true;

        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public void clear() {
        //如果是基本类型，数组中的元素是否要清理成无效值，其实无所谓
        //但如果是引用类型，必须把数组中的元素修改成null，这样才不会造成内存泄漏问题
        Arrays.fill(array,null);
        size=0;

    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        E e=array[index];
        array[index]=element;
        return e;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        //泛型中，引用类型的处理
        for(int i=0;i<size;i++) {
            if (o == null) {
                if (array[i] == o) {
                    return i;
                }
            }else{
                //平时调用ArrayList中的contains/indexof等
                if(o.equals(array[i])){
                    return i;
                }
            }
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new RuntimeException("暂时不实现");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new RuntimeException("暂时不实现");
    }
}
