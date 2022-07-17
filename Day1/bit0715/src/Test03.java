import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/16 13:53
 */

/*class Student {
    public int age;
}*/


class Student implements Comparable<Student>{
    public int age;
    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
    public Student(int age){
        this.age=age;
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
public class Test03 {

/*    public static void topK1(int[] array,int k){
        PriorityQueue<Integer> maxPQ=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i=0;i<array.length;i++){
            maxPQ.offer(array[i]);
        }
        for(int i=0;i<k;i++){
            int val=maxPQ.poll();//每次弹出一个元素
            System.out.println(val);
        }
    }*/

    public static int[] topK2(int[] array,int k){
        PriorityQueue<Integer> maxPQ=new PriorityQueue<>(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i=0;i<array.length;i++){
            if(maxPQ.size()<k){
                maxPQ.offer(array[i]);
            }else{
                //获取堆顶元素
                int top=maxPQ.peek();
                //找前k个最小的
                if(array[i]<top){
                    maxPQ.poll();//出堆顶元素
                    maxPQ.offer(array[i]);//把当前循环到的元素放到堆中
                }
            }
        }
        int[] ret=new int[k];
        for(int i=0;i<k;i++){
            int val=maxPQ.poll();//每次弹出一个元素
            ret[i]=val;
        }
        return ret;
    }



   /* public static void main(String[] args) {
        int[] array={12,45,32,17,2,18,5,10};
        topK1(array,3);
    }*/

    public static void main1(String[] args) {
        AgeComparator ageComparator=new AgeComparator();
        PriorityQueue<Student> priorityQueue=new PriorityQueue<>(ageComparator);
        PriorityQueue<Student> priorityQueue1=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        });
        PriorityQueue<Student> priorityQueue2=new PriorityQueue<>((o1,o2) ->{return o1.age-o2.age;} );
        priorityQueue.offer(new Student(5));
        priorityQueue.offer(new Student(14));
    }
}
