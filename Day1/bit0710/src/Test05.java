import java.util.Stack;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:实现最小栈
 * @date 2022/7/10 21:53
 */
public class Test05 {
}

class MinStack {
    private Stack<Integer> s;//普通栈
    private Stack<Integer> minStack;//维护当前栈的最小值

    public MinStack() {
        s=new Stack<>();
        minStack=new Stack<>();
    }

    //入栈：入到普通栈，并且判断是否需要入到最小栈当中
    public void push(int val) {
        s.push(val);
        if(minStack.empty()){
            //最小栈如果没有元素，则必须放到最小栈当中
            minStack.push(val);
        }else{
            int peekV=minStack.peek();
            if(val<=peekV){
                minStack.push(val);
            }
        }
    }

    //出栈,出普通栈的元素，并且判断是否要出最小栈的元素
    public void pop() {
        if(!s.empty()){
            int popV=s.pop();
            int peekVMinS=minStack.peek();
            if(popV==peekVMinS){
                minStack.pop();
            }
        }
    }
    //获取栈顶元素
    public int top() {
        if(!s.empty()){
            return s.peek();
        }
        return -1;
    }

    public int getMin() {
        if(!minStack.empty()){
            return minStack.peek();
        }
        return -1;
    }
}
