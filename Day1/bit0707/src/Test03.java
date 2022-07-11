import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/7 21:09
 */
public class Test03 {
}


/**
 * 两个队列实现栈
 */
/*
class MyStack {
    Queue<Integer> qu1;
    Queue<Integer> qu2;
    public int usedSize;
    public MyStack() {
        qu1=new LinkedList<>();
        qu2=new LinkedList<>();
    }

    //入栈
    void push(int x) {
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(qu2.isEmpty()){
            qu2.offer(x);
        }else{
            qu1.offer(x);
        }
        usedSize++;
    }

    */
/**
     * 出栈，那个队列不为空，就出那个栈的元素
     * @return
     *//*

    int pop() {
        if(empty()){
            return -1;
        }
        //size会变化
        if(!qu1.isEmpty()){
            for(int i=0;i<qu1.size()-1;i++){
                qu2.offer(qu1.poll());
            }
            return qu1.poll();
        }else{
            for(int i=0;i<qu2.size()-1;i++){
                qu1.offer(qu2.poll());
            }
            return qu2.poll();
        }
    }

    int top() {

    }

    public boolean empty() {
        return usedSize==0;
    }
};
*/


























