package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 19:51
 */
public class Stack {//栈类
    //提供一个数组来存储栈的元素
    Object[] elements=new Object[10];
    //栈帧：永远指向栈顶部的元素
    //每加一个元素，栈帧+1
    //每减一个元素，栈帧-1
    int index=0;
    //构造方法
    //push方法（push压栈）
    //压栈表示栈中多一个元素
    //如果栈满了，则压栈失败
    //pop方法（弹栈）
    //栈中少一个元素
    //栈如果空，则弹栈失败
    //

    public static void main(String[] args) {

    }
}
