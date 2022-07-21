import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/19 21:46
 */
public class Test03 {
    private static void mergeSortFunc(int[] array,int left,int right){
        int mid=(left+right)/2;
        //1.分解左边
        mergeSortFunc(array,left,mid);
        //2.分解右边
        mergeSortFunc(array, mid+1, right);
        //3.进行合并
        merge(array,left,right,mid);
    }
    private static void merge(int[] array,int start,int end,int minIndex){
        int[] tmpArr=new int[end-start+1];
        int k=0;//tmpArr数组的下标
        int s1=start;//第一段开始
        int e1=minIndex;//第一段结束
        int s2=minIndex+1;//第二段开始
        int e2=end;//第二段结束
        while(s1<=e1 && s2<=e2){
            //两个归并段都存在数据
            if(array[s1]<=array[s2]){
                tmpArr[k++]=array[s1++];
            }else{
                tmpArr[k++]=array[s2++];
            }
        }
        //当走到这里的时候，说明有一个归并段当中没有数据了，拷贝另一半的全部到tmpArr数组当中
        while(s1<=e1){
            tmpArr[k++]=array[s1++];
        }
        while(s2<=e2){
            tmpArr[k++]=array[s2++];
        }
        //把排好序的数字拷贝会原数组
        for(int i=0;i<k;i++){
            array[i+start]=tmpArr[i];
        }
    }

    public static void mergeSort(int[] array){
     mergeSortFunc(array,0,array.length-1);
    }


    /**
     * 时间复杂度：O（N+范围）
     * 空间复杂度：O（范围）
     * 稳定性：稳定
     * 计数排序：适合给定一个范围进行排序
     * @param array
     */
    //计数排序
    public static void countSort(int[] array){
        int maxVal=array[0];
        int minVal=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<minVal){
                minVal=array[i];
            }
            if(array[i]>maxVal){
                maxVal=array[i];
            }
        }
        //此时可以确定要排序数组的最大和最小值了
        int len=maxVal-minVal+1;//计数数组的长度
        int[] count=new int[len];//计数数组
        //开始遍历array数组进行计数
        for(int i=0;i< array.length;i++){
            int val=array[i];
            count[val-minVal]++;
        }
        int index=0;//array数组的下标
        for(int i=0;i<count.length;i++){
            //确保count数组可以检查完
            while(count[i]!=0){
                array[index]=i+minVal;
                index++;
                count[i]--;
            }
        }
    }
}
