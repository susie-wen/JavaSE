import java.util.Comparator;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:写一个泛型类，找出数组当中的最大值
 * @date 2022/7/31 9:23
 */
class Alg<T extends Comparable<T>>{
    public T findMaVal(T[] array){
        T max=array[0];
        for(int i=0;i< array.length;i++){
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }
}

class Alg2{
    public static<T extends Comparable<T>> T findMaxVal(T[] array){
        T maxVal=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i].compareTo(maxVal)>0){
                maxVal=array[i];
            }
        }
        return maxVal;
    }
}
public class Test01 {
    public static void main(String[] args) {
        Integer[] array={78,99,5,6,10};
        int val=Alg2.findMaxVal(array);
        System.out.println(val);
    }
}
