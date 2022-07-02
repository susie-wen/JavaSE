package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 19:40
 */
public class Test07 {
    public static void main(String[] args) {
        int[][] array=new int[3][4];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int[][] a={
                {1,2,3,4},
                {9,8,0,7,},
                {5,8,1}
        };
        printArray(a);
        printArray(new int[][]{{1,2,3},{54,0,9}});
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array[i].length;j++){
            System.out.println(array[i][j]+" ");
            }
        }
    }
}
