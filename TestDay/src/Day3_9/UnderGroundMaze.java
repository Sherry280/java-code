package Day3_9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class UnderGroundMaze {
    /**
     * 地下迷宫问题：
     *
     */
    static boolean flag=false;
    static int n,m,p;
    static int maxEnergy;
    static String path;
    static int[][] array;
    static LinkedList<String> list=new LinkedList<>();

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            array=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    array[i][j]=sc.nextInt();
                }
            }

            search(0,0,p);
            if(!flag){
                System.out.println("Can not escape!");
            }else{
                System.out.println(path);
            }
        }
    }

    public static void search(int x,int y,int energy){
        if(energy<0||x<0||y<0||x>=n||y>=m||array[x][y]!=1){
            return;
        }else{
            list.offer("["+x+";"+y+"]");
            array[x][y]=0;
            if(x==0&&y==m-1){
                if(energy>=maxEnergy){
                    maxEnergy=energy;
                    undatePath();
                }
                array[x][y] = 1;
                list.removeLast();
                flag = true;
                return;

            }
            search(x,y+1,energy+1);
            search(x+1,y,energy);
            search(x-1,y,energy-3);
            search(x,y-1,energy-1);
            array[x][y]=1;
            list.removeLast();
        }
    }

    public static void undatePath(){
        StringBuilder sb=new StringBuilder();
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next()+",");
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        path=sb.toString();
    }
}
