import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 19:22
 */
class Card{
    public int rank;
    public String suit;
    public Card(int rank,String suit){
        this.rank=rank;
        this.suit=suit;
    }
    public String toString(){
            return
    }
}
public class Test {
    public static final String[] suits={"♥","♠","♣","♦"};
    public List<Card> buyDeskCard() {
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                Card card = new Card(i, suits[j]);
            }
        }
        return cards;
    }
    //洗牌
    public void shuffle(List<Card> cards){
        for(int i=cards.size()-1;i>0;i--){
            Random random=new Random();
            int index=random.nextInt(i);//该类的nextInt(int n)函数表示随机生成0~n之间的整数。
            swap(cards,index,i);
        }
    }
    private void swap(List<Card> cards,int i,int j){
      //  Card tmp=cards[i];
        Card tmp=cards.get(i);
      //  cards[i]=cards[j];
        cards.set(i,cards.get(j));
      //  cards[j]=tmp;
        cards.set(j,tmp);
    }
    public void test(List<Card> cards){
            List<Card> hand1=new ArrayList<>();
            List<Card> hand2=new ArrayList<>();
            List<Card> hand3=new ArrayList<>();
            List<List<Card>> hands=new ArrayList<>();//底层是一个二维数组
            hands.add(hand1);
            hands.add(hand2);
            hands.add(hand3);
            //3个人每个人轮流抓5张牌
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                Card card=cards.remove(0);
                hands.get(j).add(card);
            }
        }
    }
}




