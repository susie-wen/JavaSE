package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 19:25
 */
public class Test06 {
    public static void main(String[] args) {
        //二维数组
        int[][] a={
                {100,200,300},
                {300,200,100},
                {0},
                {11,0,99,1}
        };

        //二维数组遍历
        String[][] array={
                {"java","oracle","python","c#"},
                {"张三","李四","王五"},
                {"lucky","rose"}
        };
        for(int i=0;i<array.length;i++){
            String[] b=array[i];
            for(int j=0;j<b.length;j++){
                System.out.print(b[j]+" ");
            }
            System.out.println();
        }
    }
}
