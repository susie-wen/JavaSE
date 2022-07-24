import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 10:26
 */
public class Test01 {
    // 归并排序---递归
    public static void mergeSortFunc(int[] array,int left,int right){
        if(left>=right)return;
        int mid=(left+right)/2;
        mergeSortFunc(array,left,mid);
        mergeSortFunc(array,mid+1,right);
        merge(array,left,right,mid);
    }
    public static void merge(int[] array,int start,int end,int mid){
        int[] tmpArr=new int[end-start+1];
        int k=0;
        int s1=start;
        int s2=mid+1;
        while(s1<=mid && s2<=end){
            if(array[s1]<array[s2]){
                tmpArr[k++]=array[s1++];
            }else{
                tmpArr[k++]=array[s2++];
            }
        }
        while(s1<=mid){
            tmpArr[k++]=array[s1++];
        }
        while(s2<=end){
            tmpArr[k++]=array[s2++];
        }
        for(int i=0;i<k;i++){
            array[i+start]=tmpArr[i];
        }
    }
    public static void mergeSort(int[] array){
        // write code  here
        mergeSortFunc(array,0,array.length-1);
    }

// 归并排序---非递归
    public static void mergeSort2(int[] array){
        // write code  here
        int gap = 1;//每组的数据

        while (gap < array.length) {

            for (int i = 0; i < array.length; i += gap*2 ) {
                //进入这个循环 i一定合法
                int s1 = i;
                int e1 = s1+gap-1;
                if(e1 >= array.length) {
                    e1 = array.length-1;
                }
                int s2 = e1+1;
                if(s2 >= array.length) {
                    s2 = array.length-1;
                }/**/
                int e2 = s2+gap-1;
                //int e2 = e1+gap;
                if(e2 >= array.length) {
                    e2 = array.length-1;
                }
                merge(array,s1,e2,e1);
            }
            gap *= 2;
        }
    }

// 计数排序
    public static void countSort(int[] array){
        // write code  here
        int minVal=array[0];
        int maxVal=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<minVal){
                minVal=array[i];
            }
            if(array[i]>maxVal){
                maxVal=array[i];
            }
        }
        int len=maxVal-minVal+1;
        int[] count=new int[len];
        for(int i=0;i< array.length;i++){
            int val=array[i]-minVal;
            count[val]++;
        }
        int index=0;
        for(int i=0;i<array.length;i++){
            while(count[i]!=0){
                array[index]=i+minVal;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={6,7,0,3,5,2,1,9};
        countSort(array);
        System.out.println("计数排序："+Arrays.toString(array));
        int[] array1={6,7,0,3,5,2,1,9};
        mergeSort(array1);
        System.out.println("归并递归排序："+Arrays.toString(array1));
        int[] array2={6,7,0,3,5,2,1,9};
        mergeSort2(array2);
        System.out.println("归并非递归排序："+Arrays.toString(array2));
    }
}
