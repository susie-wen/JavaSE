package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 16:48
 */
public class Test02 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        printArray(x);
        String[] s=new String[4];
        printArray(s);
        //新的写法：
        printArray(new int[]{1,2,3,4});
    }

    public static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
