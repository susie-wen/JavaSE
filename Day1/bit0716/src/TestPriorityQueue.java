import java.util.PriorityQueue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/16 20:21
 */
class Card1 {
    public int rank;   // 数值
    public String suit; // 花色
    public Card1(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}

public class TestPriorityQueue {
    public static void TestPriorityQueue()
    {
        PriorityQueue<Card1> p = new PriorityQueue<>();
        p.offer(new Card1(1, "♠"));
        p.offer(new Card1(2, "♠"));
    }

    public static void main(String[] args) {
        TestPriorityQueue();
    }
}