import java.util.PriorityQueue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/16 10:35
 */


public class Test02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(12);
        priorityQueue.offer(5);
        priorityQueue.offer(42);
        priorityQueue.offer(8);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());


//        PriorityQueue<Student> priorityQueue1=new PriorityQueue<>();
//        priorityQueue.offer(new Student());
//        priorityQueue.offer(new Student());
    }
}
