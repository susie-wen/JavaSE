package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 20:27
 */
public class MyStackTest {
    public static void main(String[] args) {
        //创建一个栈对象，初始化容量是10个元素
        Stack s=new Stack();
        //调用方法压栈
        s.push(10);
        s.push(new Object());
        s.push(10);
        s.push(new Object());
        s.push(10);
        s.push(new Object());
        s.push(10);
        s.push(new Object());
        s.push(10);
        s.push(new Object());
        s.push(new Object());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
