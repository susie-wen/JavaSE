import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:快排挖坑法
 * @date 2022/7/18 13:32
 */
public class Test02 {
    private static int partition(int[] array,int start,int end){
        int key=array[start];
        while(start<end){
            while(start<end && array[end]>=key){
                end--;
            }
            array[start]=array[end];
            while(start<end && array[start]<=key){
                start++;
            }
            array[end]=array[start];
        }
        array[start]=key;
        return start;
    }

    public static void quickSort(int[] array){
        quick(array,0, array.length-1);
    }

    private static void quick(int[] array,int left,int right){
        //递归结束的条件：左边>=右边
        //当左边=右边时，相当于只有一个节点
        // 而左边有可能大于右边，即没有子树（因为新的right=基准-1），可能超过left，因此要大于
        if(left>=right)return;
        int pivot=partition(array,left,right);//找到基准
        //递归基准的左边和右边
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }

    public static void main(String[] args) {
        int[] array={6,3,5,7,9,0,1,4,6,5};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
