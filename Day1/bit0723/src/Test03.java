import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/23 13:10
 */
public class Test03 {
    public static void main(String[] args) {
        int[] array={8,8,6,90,2,4,5,7,8,54,3,53,2,4};
        insertSort(array);
        System.out.println("插入排序："+ Arrays.toString(array));
        int[] array1={8,8,6,90,2,4,5,7,8,54,3,53,2,4};
        shellSort(array1);
        System.out.println("希尔排序："+Arrays.toString(array1));
    }
    // 插入排序
    public static void insertSort(int[] array){
        // write code  here
        for(int i=0;i< array.length;i++){
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


        // 希尔排序
    public static void shellSort(int[] array){
        // write code  here
        for(int gap=array.length;gap>0;gap/=2){
            shell(array,gap);
        }
        shell(array,1);
    }
    public static void shell(int[] array,int gap){
        for(int i=gap;i< array.length;i++){
            int tmp=array[i];
            int j;
            for(j=i-gap;j>=0&&tmp<array[j];j-=gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=tmp;
        }
    }
}
