/**
 * @author Susie-Wen
 * @version 1.0
 * @description:<T>是标志位：代表当前类是泛型类
 * @date 2022/7/27 23:05
 */
class MyArray2<T>{
    public T[] array=(T[])new Object[10];
    public T getPos(int pos){
        return array[pos];
    }
    public void setVal(int pos, T val){
        this.array[pos]=val;
    }
}
public class Test02 {
    public static void main(String[] args) {
        //1、<>里面指定了类型，说明此时这个类里面只能放这个数据类型的数据
        MyArray2<String> myArray2=new MyArray2<String>();
        myArray2.setVal(0,"abc");
        myArray2.setVal(1,"hello");

    }
}
