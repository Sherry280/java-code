package LeetCode1;

import java.util.Scanner;

class Node3{
    public Node next;
    public Node prev;
    public int data;
    Node3 (int data){
        this.data=data;
    }


}

public class TestDemo3 {
    public Node head;

    //删除第一次出现的12
//    public void remove(int key){
//        if(head==null){
//            return;
//        }
//
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("* ");
                    }
                    if(i!=1&&i!=n){
                        for(int k=1;k<n-2;k++){
                            System.out.print(" ");
                        }
                    }
                }
            }
        }

    }
}
