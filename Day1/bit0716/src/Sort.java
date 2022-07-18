/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/16 21:53
 */
public class Sort {

    //直接插入排序
    public void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
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

    private static void shell(int[] array,int gap){
        //i++:只有这样才能保证每一组都进行了插入排序
        for(int i=gap;i< array.length;i++){
            int tmp=array[i];
            int j=i-gap;
            for(;j>=0;j-=gap){
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else{
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    //希尔排序
    public static void shellSort(int[] array){
        int gap=array.length;
        while (gap>1){
            shell(array,gap);
            gap/=2;
        }
        shell(array,1);//最后将整体看成插入排序
/*        int[] drr={5,2,1};//增量
        for(int i=0;i<drr.length;i++){
            shell(array,drr[i]);
        }*/
    }

    //直接选择排序
    public static void selectSort(int[] array){
        for(int i=0;i< array.length;i++){
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            swap(array,minIndex,i);
            }
        }
        //交换函数：交换array数组的i和j下标
        private static void swap(int[] array,int i,int j){
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
    }

/*    public static void selectSort2(int[] array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int minIndex=left;
            int maxIndex=right;
            for(int i=left;i<=right;i++){
                if(array[i]<array[minIndex]){
                    minIndex=i;
                }
                if(array[i]>array[maxIndex]){
                    maxIndex=i;
                }
            }
            swap(array,left,minIndex);
            swap(array,right,maxIndex);
            left++;
            right--;
        }
    }*/

    //堆排序
    public static void heapSort(int[] array){
        //1.创建大根堆
        createBigHeap(array);
        int end= array.length-1;
        while(end>=0){
            swap(array,0,end);
            shiftDown(array,0,end);
            end--;
        }
    }

    //创建一个大根堆
    private static void  createBigHeap(int[] array){
        for(int parent=(array.length-1-1)/2;parent>=0;parent--){
            shiftDown(array,parent, array.length);
        }
    }

    //向下调整
    private static void shiftDown(int[] array,int parent,int len){
        int child=2*parent-1;
        //最起码保证有左孩子
        while(child<len){
            if(child+1<len && array[child]<array[child+1]){
                child++;
            }
            if(array[child]>array[parent]){
                swap(array,child,parent);
                parent=child;
                child=2*parent+1;
            }else{
                break;
            }
        }
    }

}
