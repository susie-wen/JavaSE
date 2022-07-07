import java.util.*;
/**
 * @author Susie-Wen
 * @version 1.0
 * @description:模拟实现一个栈
 * @date 2022/7/6 19:38
 */
public class MyStack {
    /**
     * usedSize:表示当前存储的有效的数据个数，
     * 也可以表示当前可以存放的数据元素的下标
     */
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY=10;
    //初始栈的大小，类似于源码当中的capacityIncrement

    public MyStack(){
        elem=new int[DEFAULT_CAPACITY];
    }

    /**
     * 压栈
     * @param val 要入栈的元素值
     */
    public void push(int val){
        /**
        * 1、isFull()判断栈是否是满的
        * */
        if(isFull()){
            //栈满了，就进行二倍扩容
            elem=Arrays.copyOf(elem,2*elem.length);
        }
        //存放到当前下标，同时usedSize需要自增
        elem[usedSize]=val;
        usedSize++;
    }

    /**
     * 判断栈当前是否是满的
     * @return
     */
    public boolean isFull(){
        if(usedSize==elem.length){
            return true;
        }
        return false;
    }

    /**
     * 删除栈顶元素，
     * 分析：这里不是引用数据类型，而是基本数据类型
     * 删除就是直接让usedSize--，这样新的数据添加进来就会覆盖应该被删除的数据
     * @return
     */
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException("栈为空了！");
        }
        int oldVal=elem[usedSize-1];
        usedSize--;
        return oldVal;
    }
    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return usedSize==0;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException("栈为空了，无法获取栈顶元素");
        }
        return elem[usedSize-1];
    }
    public int getUsedSize(){
        return usedSize;
    }
}
