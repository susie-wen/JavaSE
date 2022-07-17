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
            int min=array[i];
            for(int j=i;j<array.length;j++){
                if(min>array[j]){
                    min=array[j];
                }
            }
            swap(array,min,i);
            }
        }
        //交换函数：交换array数组的i和j下标
        private static void swap(int[] array,int i,int j){
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
    }
}
