import java.util.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/21 15:08
 */

/*1、10W个数据，把这10W个数据当中的重复元素删除掉。

2、10W个数据，找到这10W个数据当中第一个重复的数据。

3、10W个数据，统计这10W个数据当中，每个数据出现的次数。*/
public class Test03 {

    public static void func1(int[] array){
        Set<Integer> set=new HashSet<>();
        //这里不使用TreeSet因为HashSet效率更高O(1)
        for(int i=0;i< array.length;i++){
            set.add(array[i]);
        }
    }
    public static int func2(int[] array){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i< array.length;i++){
            if(!set.contains(array[i])){
                set.add(array[i]);
            }else{
                return array[i];
            }
        }
        return -1;
    }
    public static void func3(int[] array){
        //key:关键字  val:次数
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< array.length;i++){
            int key=array[i];
            if (map.get(key)==null) {
                map.put(key,1);
            }else{
                int val=map.get(key);
                map.put(key,val+1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] array=new int[10_0000];
        Random random=new Random();
        for(int i=0;i< array.length;i++){
            array[i]=random.nextInt(5_000);
        }
        func1(array);
        System.out.println(func2(array));
        func3(array);
    }
}
