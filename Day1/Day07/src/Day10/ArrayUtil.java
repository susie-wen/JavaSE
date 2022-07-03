package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 19:54
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr={10,20,23,25,60,100,999};
        //需求：找出arr这个数组所在的下标
        //调用方法
        int index=binarySearch1(arr,60);
        System.out.println(index==-1 ? "该元素不存在":"该元素的下标是："+index);
    }

    /**
     * 从数组当中查找目标元素的下标。
     * @param arr 被查找的数组（必须是已经排序的）
     * @param dest 目标元素
     * @return 返回目标元素的下标,-1表示该元素不存在
     */
    private static int binarySearch1(int[] arr, int dest) {
        int begin=0;
        int end=arr.length-1;
        while (begin <= end) {
            int mid=(begin+end)/2;
            if(arr[mid]==dest){
                return mid;
            }else if(arr[mid] <dest){
                begin=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
