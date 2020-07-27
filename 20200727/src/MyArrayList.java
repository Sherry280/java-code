import java.util.Arrays;

public class MyArrayList {
    //实现顺序表
    public int[] elem;
    public int usedSize;
    public MyArrayList(){
        this.elem=new int[5];
        this.usedSize=0;
    }

//    public int[] getElem() {
//        return elem;
//    }
//
//    public void setElem(int[] elem) {
//        this.elem = elem;
//    }
//
//    public int getUsedSize() {
//        return usedSize;
//    }
//
//    public void setUsedSize(int usedSize) {
//        this.usedSize = usedSize;
//    }


    //向顺序表中添加元素
    public void add(int pos, int data){
        if(pos<0||pos>usedSize){
            System.out.println("参数不合法");

        }
        if(this.usedSize==this.elem.length){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for(int i=usedSize-1;i>pos;i--){
            this.elem[i]=this.elem[i-1];

        }
        this.elem[pos]=data;
        this.usedSize++;

    }

    //打印
    public void show(){
        for(int i=0;i<this.usedSize;i++){
            System.out.println(this.elem[i]+" ");
        }
        System.out.println();
    }
    //判断是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(elem[i]==toFind){
                return true;
            }

        }
        return false;
    }





    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(elem[i]==toFind){
                return 1;
            }
        }
        return -1;
    }





    //获取Pos位置的元素
    public int getPos(int pos){
        if(pos<0||pos>=this.usedSize){
            System.out.println("该位置不合法");
            return -1;
        }
        return this.elem[pos];
    }





    //给pos位置的元素设置为value
    public void setPos(int pos,int value){
        if(pos<0||pos>=this.usedSize){
            System.out.println("该位置不合法");
        }
        this.elem[pos]=value;
    }





    //获取顺序表的长度
    public int size(){
        return this.usedSize;
    }


    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有该元素");
            return ;
        }
        for (int i=index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }








}
