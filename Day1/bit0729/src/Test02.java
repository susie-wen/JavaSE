/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/29 18:26
 */
class MyArray<T>{
    public T[] array=(T[])new Object[10];
    public void setVal(int pos,int val){
     //  this.array[pos]=val;
    }
    public T getPos(int pos){
        return this.array[pos];
    }
}
public class Test02 {
    public static void main(String[] args) {
    MyArray<Integer> myArray=new MyArray<>();
    }
}
