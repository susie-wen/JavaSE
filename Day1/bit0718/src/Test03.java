/**
 * @author Susie-Wen
 * @version 1.0
 * @description:归并排序
 * @date 2022/7/19 10:37
 */
public class Test03 {
    public static void mergerSortFunc(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        //1、分解左边
        mergerSortFunc(array,left,mid);
        //2、分解右边
        mergerSortFunc(array,mid+1,right);
        //3、进行合并
        merge(array,left,right,mid);
    }

    private static void merge(int[] array, int start, int end, int midIndex){
        int[] tmpArr=new int[end-start+1];
        int k=0;
        int s1=start;
        int e1=midIndex;
        int s2=midIndex+1;
        int e2=end;
        //两个归并段都有数据
        while(s1<=e1 && s2<=e2){
            if(array[s1]<=array[s2]){
                tmpArr[k++]=array[s1++];
            }else{
                tmpArr[k++]=array[s2++];
            }
        }
        //当走到此处时，说明有一个归并段已经无数据，此时拷贝另一半的全部到新的tmpArr数组当中
        while(s1<=e1){
            tmpArr[k++]=array[s1++];
        }
        while ((s2<=e2)){
            tmpArr[k++]=array[s2++];
        }
        for(int i=0;i<k;i++){
            array[i+start]=tmpArr[i];
        }
    }

    /**
     * 时间复杂度：O（n*logn）
     * 空间复杂度：O（n）
     * 稳定性：稳定
     * @param array
     */
    public static void mergerSort1(int[] array){
        mergerSortFunc(array,0,array.length-1);
    }

    //归并排序的非递归实现
    public static void mergeSort(int[] array){
        int gap=1;
        while(gap< array.length){
            for(int i=0;i<array.length;){
                int s1=i;
                int e1=s1+gap-1;
                if(e1>=array.length){
                    e1=array.length-1;
                }
                int s2=e1+1;
                int e2=s2+gap-1;
                merge(array,s1,e2,e1);
            }
        }
    }
}
