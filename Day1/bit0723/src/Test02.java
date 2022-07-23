import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/23 9:48
 */
public class Test02 {
    public static void main(String[] args) {
        int[] array={8,8,6,90,2,4,5,7,8,54,3,53,2,4};
        selectSort(array);
        System.out.println("选择排序："+Arrays.toString(array));
        int[] array1={8,8,6,90,2,4,5,7,8,54,3,53,2,4};
        heapSort(array1);
        System.out.println("堆排序："+Arrays.toString(array1));
    }
    // 选择排序
    public static void selectSort(int[] array){
        // write code  here
        for(int i=0;i< array.length;i++){
            int minIndex=i;
            for(int j=i+1;j< array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            swap(array,minIndex,i);
        }
    }
    public static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }


// 堆排序
public static void heapSort(int[] array) {
    createBigHeap(array);
    for(int end= array.length-1;end>=0;end--){
        swap(array,0,end);
        shiftDown(array,0,end);
    }

}

    private static void createBigHeap(int[] array) {
        for(int parent=(array.length-1-1)/2;parent>=0;parent--){
            shiftDown(array,parent,array.length);
        }
    }

    private static void shiftDown(int[] array, int parent, int len) {
        for(int child=2*parent+1;child<len;child=2*child+1){
            if(child+1<len && array[child]<array[child+1]){
                child++;
            }
            if(array[parent]>=array[child]){
                break;
            }
            swap(array,parent,child);
            parent=child;
        }

    }
}
