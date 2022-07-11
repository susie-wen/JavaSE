import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:用队列实现栈
 * @date 2022/7/10 20:52
 */
public class Test03 {
}

class MyStack {
    Queue<Integer> qu1;
    Queue<Integer> qu2;
    public int usedSize;
    public MyStack() {
        qu1=new LinkedList<>();
        qu2=new LinkedList<>();
    }

    //入栈:把元素入到不为空的队列当中
    public void push(int x) {
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else{
            qu1.offer(x);
        }
        usedSize++;
    }


    //出栈
    public int pop() {
        if(empty()){
            return -1;
        }
        //这里必须定义一个临时变量curSize，不能直接使用size方法
        //因为size方法会变化
        if(!qu1.isEmpty()){
            int curSize=qu1.size();
            for(int i=0;i<curSize-1;i++){
                qu2.offer(qu1.poll());
            }
            usedSize--;
            return qu1.poll();
        }else{
            int curSize=qu2.size();
            for(int i=0;i<curSize-1;i++){
                qu1.offer(qu2.poll());
            }
            usedSize--;
            return qu2.poll();
        }
    }

    //获取栈顶元素
    public int top() {
        if(empty()){
            return -1;
        }
        //这里必须定义一个临时变量curSize，不能直接使用size方法
        //因为size方法会变化
        if(!qu1.isEmpty()){
            int curSize=qu1.size();
            int ret=-1;
            for(int i=0;i<curSize;i++){
                ret=qu1.poll();
                qu2.offer(ret);
            }
            return ret;
        }else{
            int ret=-1;
            int curSize=qu2.size();
            for(int i=0;i<curSize;i++){
                ret=qu2.poll();
                qu1.offer(ret);
            }
            return ret;
        }
    }

    //判断是否栈空
    public boolean empty() {
        return usedSize==0;
    }
}