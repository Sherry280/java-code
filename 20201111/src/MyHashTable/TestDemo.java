package MyHashTable;

import java.util.Arrays;
import java.util.HashMap;

public class TestDemo {

    public static void main(String[] args) {
        String s="huddiolabcsjddddop";
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            count[idx]++;
        }
        System.out.println(Arrays.toString(count));











//        int[] elements={4,87,6,45,9,0,2};
//        MyHashTable hashTable=new MyHashTable();
//        for(int e:elements){
//            hashTable.insert(e);
//        }
//        System.out.println("----------------");
//        System.out.println(hashTable.contains(88));
//        System.out.println(hashTable.remove(2));


    }
}
