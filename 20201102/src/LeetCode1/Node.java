package LeetCode1;

import java.util.Scanner;

public class Node {
    public Node next;
    public int val;
    public Node random;
    public Node(int val){
        this.val=val;
    }

    public static class Test1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();

                }
            }
        }
    }
}
