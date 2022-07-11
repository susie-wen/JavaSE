import java.util.*;
/**
 * @author Susie-Wen
 * @version 1.0
 * @description:栈实现队列
 * @date 2022/7/10 21:33
 */
public class Test04 {
}
/*

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    //入队：全部入到第一个栈
    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(empty())
            return -1;//代表当前队列为空
        if(s2.empty()){
            //需要把s1里面的元素全部倒过来
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
        //此时s2当中一定有元素
        return s2.pop();
    }

    public int peek() {
        if(empty())
            return -1;//代表当前队列为空
        if(s2.empty()){
            //需要把s1里面的元素全部倒过来
            while(!s1.empty()){
                s2.push(s1.pop());
            }
        }
        //此时s2当中一定有元素
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}*/
