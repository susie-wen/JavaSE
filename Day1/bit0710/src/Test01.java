import java.util.*;
import java.util.Queue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/10 10:16
 */
public class Test01 {
    public static void main(String[] args) {
        Deque<Integer> myQueue =new LinkedList<>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
    }
}
