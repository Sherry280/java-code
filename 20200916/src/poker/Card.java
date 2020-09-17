package poker;

import java.util.Objects;

public class Card {
    public String suit;//花色
    public int rank;//分值
    //构造方法
    public Card(String suit,int rank){
        this.rank=rank;
        this.suit =suit;
    }

    @Override
    public String toString() {
        return String.format("[%s%d]",suit,rank);
    }
    //重写比较相等的方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }


}
