package MyHashTable;

import java.util.HashMap;

public class TestDemo {

    public static void main(String[] args) {
        int[] elements={4,87,6,45,9,0,2};
        MyHashTable hashTable=new MyHashTable();
        for(int e:elements){
            hashTable.insert(e);
        }
        System.out.println("----------------");
        System.out.println(hashTable.contains(88));
        System.out.println(hashTable.remove(2));


    }
}
