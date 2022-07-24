import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 20:03
 */

@FunctionalInterface
interface A{
    void test1();
//    void test2();只能有一个抽象方法
    public static void test2(){
    }
}
public class Test02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
    }
    //匿名内部类
    //此时相当于一个类实现了comparator接口，同时重写了抽象方法compare
    PriorityQueue<Integer> priorityQueue2=new PriorityQueue<>((o1,o2)->{return o2-o1;});
    PriorityQueue<Integer> priorityQueue3=new PriorityQueue<>((o1,o2)->o2-o1);
}
