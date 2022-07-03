package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 20:22
 */

import java.util.Arrays;
public class Test01 {
    public static void main(String[] args) {
        int[] a={4,5,2,3,6,8};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int index=Arrays.binarySearch(a,5);
        System.out.println(index==-1 ? "该元素不存在":"该元素下标是："+index);
    }
}
