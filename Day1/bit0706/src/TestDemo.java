import java.sql.SQLOutput;
import java.util.Stack;
/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/6 19:30
 */
public class TestDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(24);
        stack.push(48);
        stack.push(36);
        int val=stack.peek();//获取栈顶元素但不删除
        System.out.println("栈顶元素是："+val);//36

        int val2=stack.pop();//删除栈顶元素
        System.out.println("被删除的栈顶元素是："+val2);

        if(stack.empty()){
            System.out.println("栈空");
        }else{
            System.out.println("栈的有效元素个数是："+stack.size());//获取栈中有效的元素个数
        }
    }
}
