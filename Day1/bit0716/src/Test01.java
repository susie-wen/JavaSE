import java.util.Comparator;
import java.util.Objects;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/16 19:42
 */
class Card implements Comparable<Card>{
    public int rank;   // 数值
    public String suit; // 花色
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        Card card=(Card)obj;
        return rank== card.rank && Objects.equals(suit,card.suit);
    }

    @Override
    public int compareTo(Card o) {
        return this.rank-o.rank;
    }
}

//数值比较器
class RankComparator implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        return o1.rank-o2.rank;
    }

}
//花色比较器
class SuitComparator implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        return o1.suit.compareTo(o2.suit);
    }
}
public class Test01 {

    public static void main(String[] args) {
        //数值比较器
        RankComparator rankComparator=new RankComparator();
        Card card1=new Card(1,"♠");
        Card card2=new Card(2,"♣");
        rankComparator.compare(card1,card2);

        //花色比较器
        SuitComparator suitComparator=new SuitComparator();
        System.out.println(suitComparator.compare(card1,card2));
    }

    public static void main1(String[] args) {
        Card card1=new Card(1,"♠");
        Card card2=new Card(2,"♠");
        System.out.println(card1==card2);//判断两张牌的地址是否相等
        System.out.println(card1.equals(card2));//判断两张牌是否相等
        System.out.println(card1.compareTo(card2));//比较两张牌
    }
}
