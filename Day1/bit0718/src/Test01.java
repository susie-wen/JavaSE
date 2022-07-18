import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:快排hoare法
 * @date 2022/7/18 9:42
 */
public class Test01 {

    /**
     * 冒泡排序
     * 时间复杂度：O（N^2）
     *       针对优化后的代码，在有序情况下，时间复杂度就变成了O（N）
     * 空间复杂度：
     * @param array
     */
    public static void bubbleSort(int[] array){
        for(int i=0;i< array.length-1;i++){
            boolean fla=false;
            for(int j=0;j< array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    fla=true;
                }
            }
            if(!fla)break;
        }
    }

    private static void swap(int[] array, int j, int i) {
        int tmp=array[j];
        array[j]=array[i];
        array[i]=tmp;
    }

    public static void main(String[] args) {
        int[] array={6,3,5,7,9,0,1,4,6,5};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int partition(int[] array,int start,int end){
        int i=start;
        int key=array[start];
        while(start<end){
            while(start<end && array[end]>=key){
                end--;
            }

            while(start<end && array[start]<=key){
                start++;
            }
            swap(array,start,end);
        }
        swap(array,start,i);
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

}
