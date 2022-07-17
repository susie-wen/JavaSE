import java.util.Arrays;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:排序
 * @date 2022/7/16 21:51
 */
public class Test02 {
    public static void main(String[] args) {
        int[] array={9,1,2,5,7,4,8,6,3,5};
        Sort sort=new Sort();
//        sort.insertSort(array);
        Sort.shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
