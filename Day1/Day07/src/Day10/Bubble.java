package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 19:02
 */

/**
 * 冒泡排序算法
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,5,0};
        //经过冒泡排序对以上算法排序
        int count=0,count2=0;
        for(int i= arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                count++;
                if(arr[j]>arr[j+1]){//这里把》改成《就是降序
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count2++;
                }
            }
        }
        //打印排序之后的结果
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("冒泡排序的比较次数："+count);
        System.out.println("冒泡排序的交换次数："+count2);
    }
}
