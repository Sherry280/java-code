package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;


public class Game {

    public static void printPlayerHandCard(List<Player> playerList){
        for(Player player:playerList){
            System.out.printf("玩家[%s]的手牌是：%s%n",player.name,player.cardList);
        }
    }


    public static void main(String[] args) {
        //定义5名玩家，使用List
        List<Player> playerList=new ArrayList<>();
        playerList.add(new Player("于春娟"));
        playerList.add(new Player("杨宇婷"));
        playerList.add(new Player("谢晨"));
        playerList.add(new Player("邢雨雨"));
        playerList.add(new Player("张梦珍"));


        //定义扑克牌顺序表
        //List作为容器
        List<Card> cardList=new ArrayList<>();
        //初始化扑克牌
        initializeCards(cardList);
        System.out.println(cardList);


        //调用collections下的shuffle（洗牌）方法
        //进行洗牌
        Collections.shuffle(cardList);
        //System.out.println("抽牌前，牌组中的牌：");
        System.out.println(cardList);
        //发牌
        int n=2;//每名玩家发几张牌
        for(int i=0;i<n;i++){//一共发n轮牌
            for(Player player:playerList){//每名玩家一次抽牌
                Card card=cardList.remove(0);//从牌组中，抽一张牌出来
                player.cardList.add(card);//把这张牌放到当前玩家的手中
            }
        }
        System.out.println("现在牌组中剩余的牌：");
        System.out.println(cardList);

        System.out.println("交换牌之前：");
        printPlayerHandCard(playerList);

        Card toFoundCard=new Card("♠",1);

        //已知于美人的下标为0
        Player 于美人=playerList.get(0);
        if(!于美人.cardList.contains(toFoundCard)){
            于美人.cardList.set(0,toFoundCard);
           // 于美人.cardList.set(0,new Card("♦",1));

        }
        System.out.println("于美人第一次发功：");
        printPlayerHandCard(playerList);


//        for(Player player:playerList){
//            System.out.printf("玩家[%s]的手牌是：%s%n",player.name,player.cardList);
//        }

        //交换牌
        //每名玩家随机抽取下家的一张牌
        Random random=new Random();
        for(int i=0;i<playerList.size();i++){
            Player currentPlayer=playerList.get(i);
            //下家就是按照前后关系的下一个，最后一名玩家抽取第0个
            Player nextPlayer=playerList.get(i!=playerList.size()-1?i+1:0);

            //要取的牌的下标
            int toDrawIndex=random.nextInt(nextPlayer.cardList.size());
            //取牌
            Card drawCard=nextPlayer.cardList.remove(toDrawIndex);
            //放入当前玩家的手中
            currentPlayer.cardList.add(drawCard);

        }
        System.out.println("交换牌之后：");
        printPlayerHandCard(playerList);
        if(!于美人.cardList.contains(toFoundCard)){
            于美人.cardList.set(0,toFoundCard);
            // 于美人.cardList.set(0,new Card("♦",1));

        }
        System.out.println("于美人第二次发功：");
        printPlayerHandCard(playerList);



        //要找的牌
        //Card toFoundCard=new Card("♠",1);
        for(Player player:playerList){
            if(player.cardList.contains(toFoundCard)) {
                //if(player.cardList.indexOf(toFoundCard)!=-1){
                System.out.println(player.name + "获胜");
                return;
            }
        }

//        for(Player player:playerList){
//            for(Card card:player.cardList){
//                //比较每张牌和要找的是否为同一张牌
//                if(card.equals(toFoundCard)){
//                    System.out.println(player.name+"获胜");
//                    return;
//                }
//            }
//        }
//        System.out.println("无人获胜");

//
//        //        //交换牌
//        for(int i=0;i<playerList.size();i++){
//            Player currentPlayer=playerList.get(i);
//            //下家就是按照前后关系的下一个，最后一名玩家抽取第0个
//            Player nextPlayer=playerList.get(i!=playerList.size()-1?i+1:0);
//            //要取的牌的下标
//            int toDrawIndex=random.nextInt(nextPlayer.cardList.size());
//            //取牌
//            Card drawCard=nextPlayer.cardList.remove(toDrawIndex);
//            //放入当前玩家的手中
//            currentPlayer.cardList.add(drawCard);
//
//
//        }
//        System.out.println("交换牌之后：");
//        printPlayerHandCard(playerList);
//
//
//        for(Card card: player.cardList){
//            //比较每张牌是否和要找的那张牌是同一张牌
//            if(card.equals(toFoundCard)){
//                System.out.println(player.name+"获胜");
//                return;
//            }
//        }



    }
    private static void initializeCards(List<Card> cards){
        for(String suit:new String[]{"♠","♥","♦","♣"}){
            for(int rank=1;rank<=5;rank++){
                Card card=new Card(suit,rank);
                //把扑克牌放入牌组中
                cards.add(card);
            }

        }
    }



}
