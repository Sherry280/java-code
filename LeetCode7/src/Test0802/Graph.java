package Test0802;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    /**
     * 图的邻接矩阵代码实现
     */
    private ArrayList<String> vertextList;//存放顶点集合
    private int[][] edges;//矩阵
    private int num;
    public Graph(int n){
        edges=new int[n][n];
        vertextList=new ArrayList<>(n);
        num=0;
    }
    //插入节点
    public void addVer(String vertex){
        vertextList.add(vertex);
    }
    //添加边
    public void addNum(int v1,int v2,int weight){
        //v1,v2指的是节点的下标，weight指的是权值
        edges[v1][v2]=weight;
        edges[v2][v1]=weight;
        num++;
    }
    //返回节点的个数
    public int nodeNum(){
        return vertextList.size();
    }
    //返回一共有多少条边
    public int edgeNum(){
        return num;
    }
    //通过索引返回值
    public String getValue(int i){
        return vertextList.get(i);
    }
    //返回v1和v2的权值
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }
    //显示图对应的矩阵
    public void show(){
        for(int[] link:edges){
            System.out.println(Arrays.toString(link));
        }
    }

    public static void main(String[] args) {
        int n=5;
        String vertexString[]={"A","B","C","D","E"};
        //创建图对象
        Graph gp=new Graph(5);
        //向图对象添加节点
        for(String value:vertexString){
            gp.addVer(value);
        }
        //添加边AB,AC,AE,BC,BD,CE,DE
        gp.addNum(0,1,1);
        gp.addNum(0,2,1);
        gp.addNum(0,3,1);
        gp.addNum(0,4,1);
        gp.addNum(1,2,1);
        gp.addNum(1,3,1);
        gp.addNum(2,4,1);
        gp.addNum(3,4,1);
        gp.show();

    }


}
