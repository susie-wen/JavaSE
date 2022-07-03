package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 19:23
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,5,0};
        int count=0,count2=0;
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                count++;
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                count2++;
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        //排序之后打印结果
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("选择排序的比较次数："+count);
        System.out.println("选择排序的交换次数："+count2);
    }
}
