/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/15 22:54
 */
public class TestHeap01 {
    public static void main(String[] args) {
        TestHeap testHeap=new TestHeap();
        int[] array={27,15,19,18,28,34,65,49,25,37};
        testHeap.initArray(array);
        testHeap.createHeap();
        testHeap.offer(80);
        System.out.println("nlnancaklc");
    }
}
