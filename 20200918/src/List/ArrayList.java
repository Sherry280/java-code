package List;
import java.util.Arrays;

public class ArrayList implements List {
    private int[] array;
    private int size;

    public ArrayList(){
        array=new int[10];
        size=0;

    }


    @Override
    public boolean add(Integer e) {
        if(array.length==size){
            ensureCapacity(array.length*2);
        }
        array[size++]=e;
        return true;
    }

    public void ensureCapacity(int capacity){
        if(this.array.length>=capacity){
            return;
        }
        int[] newArray=new int[capacity];
        for(int i=0;i<size;i++){
            newArray[i]=this.array[i];
        }
        this.array=newArray;
    }

    @Override
    public void add(int index, Integer e) {
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("不合法的下标："+index);
        }
        if(array.length==size){
            ensureCapacity(array.length*2);
        }
        for(int i=size-1;i>=size;i--){
            array[i]=array[i-1];

        }
        array[index]=e;
        size++;


    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Integer e) {
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
        return null;
    }

    @Override
    public Integer set(int index, Integer e) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Integer e) {
        return false;
    }

    @Override
    public int indexOf(Integer e) {
        return 0;
    }

    @Override
    public int lastIndexOf(Integer e) {
        return 0;
    }
}
