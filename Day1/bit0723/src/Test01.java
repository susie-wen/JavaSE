import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:冒泡+快速
 * @date 2022/7/23 9:17
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array={6,4,7,6,89,0,6,3,99,5,7};
        bubbleSort(array);
        System.out.println("冒泡排序："+Arrays.toString(array));
        int[] array1={6,4,7,6,89,0,6,3,99,5,7};
        quickSort(array1);
        System.out.println("快速排序："+Arrays.toString(array1));
    }
    // 冒泡排序
    public static void bubbleSort(int[] array){
        // write code  here
        for(int i=1;i< array.length;i++){
            int tmp=array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>tmp){
                    array[j+1]=array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

// 快速
    public static void quickSort(int[] array){
        // write code  here
        quick(array,0,array.length-1);
    }
    public static void quick(int[] array,int left,int right){
        if(left>=right)return;
        int pivot=partition(array,left,right);
        quick(array,left,pivot-1);
        quick(array,pivot+1,right);
    }
    public static int partition(int[] array,int start,int end){
        int i=start;
        int tmp=array[start];
        while(start<end){
            while(start<end && array[end]>=tmp){
                end--;
            }
            while(start<end && array[start]<=tmp){
                start++;
            }
            swap(array,start,end);
        }
        swap(array,start,i);
        return start;
    }
    public static void swap(int[] array,int start,int end){
        int tmp=array[start];
        array[start]=array[end];
        array[end]=tmp;
    }
}
