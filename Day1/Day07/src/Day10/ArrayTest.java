package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 18:55
 */

/**
 * 使用java.util.Arrays;
 */
import java.util.Arrays;
public class ArrayTest {
    public static void main(String[] args) {
        //工具类当中的方法大部分是静态的
        int[] arr={11,33,44,55,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
