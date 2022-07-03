package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 19:41
 */

import java.util.Arrays;
public class ArraySearch {
    public static void main(String[] args) {
        int[] arr={1,3,87,9,2};
        //找出87的下标，如果没有则返回-1
        //方法一：一个个找，效率低


        //方法二：使用工具类的方法
        //第一个参数是数组，第二个参数是被查找的元素
        int index=arraySearch(arr,87);
        System.out.println(index==-1 ? "该元素不存在":"该元素的下标是："+index);
    }

    /**
     * 从数组中检索某个元素的下标
     * @param arr 被检索的某个数组
     * @param i 被检索的元素
     * @return 返回找到的下标 -1表示不存在
     */
    private static int arraySearch(int[] arr, int i) {
        for(int t=0;t<arr.length;t++){
                if(i==arr[t]){
                    System.out.println("87的下标是："+t);
                    return t;
                }
            }
            System.out.println("不存在该元素");
            return -1;
    }
}
