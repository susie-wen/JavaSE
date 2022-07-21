import java.util.Arrays;
import java.util.Random;

/**
 * @Author 12629
 * @Description：
 */
public class TestSort {


    public static void testInsertSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.insertSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("直接插入排序耗时："+(endTime-startTime));
    }

    public static void testShellSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.shellSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("希尔排序耗时："+(endTime-startTime));
    }

    public static void testSelectSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.selectSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("选择排序耗时："+(endTime-startTime));
    }

    public static void testHeapSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.heapSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("堆排序耗时："+(endTime-startTime));
    }

    public static void testBubbleSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.bubbleSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("冒泡排序耗时："+(endTime-startTime));
    }

    public static void testQuickSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.quickSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("快速排序耗时："+(endTime-startTime));
    }

    public static void testMergeSort(int[] array) {
        array = Arrays.copyOf(array,array.length);
        long startTime = System.currentTimeMillis();
        Sort.mergerSort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("归并排序耗时："+(endTime-startTime));
    }

    public static void main(String[] args) {
        int[] array = new int[10_0000];
        initArrayOrder(array);//有序
        initArrayNotOrder(array);//无序
        testInsertSort(array);
        testShellSort(array);
        testSelectSort(array);
        testHeapSort(array);
       // testBubbleSort(array);
        testQuickSort(array);
    //    testMergeSort(array);
    }

    public static void main1(String[] args) {
        int[] array = {9,18,7,6,15,8};
        //int[] array = {8,3,10,2,7};
        //Sort.insertSort(array);
        Sort.countSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void initArrayOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void initArrayNotOrder(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000_0000);
        }
    }

}
