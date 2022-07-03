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
    private Object[] elements;//使用Object类型，因为可以存储任何类型的数据
    //由于属性私有化了，因此封装并且提供set和get方法
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        elements = elements;
    }
    //栈帧：永远指向栈顶部的元素
    //每加一个元素，栈帧+1
    //每减一个元素，栈帧-1
    private int index=-1;//此时栈帧指向了空栈的顶部元素
    //构造方法
    public Stack(){
        this.elements=new Object[10];//默认初始化容量是10
    }
    //push方法（push压栈）

    /**
     * 压栈的方法
     * @param obj 被压栈的元素
     */
    public void push(Object obj){
        if(this.index>=this.elements.length-1){
            System.out.println("栈已经满了！压栈失败！");
            return;
        }
        //程序到达这里，说明栈没有满
        elements[++index]=obj;
        //所有的输出方法在执行的时候，如果输出的是引用的话，自动调用的是toString方法
        System.out.println("压栈成功，栈帧指向:"+index);
    }
    //压栈表示栈中多一个元素
    //如果栈满了，则压栈失败
    //pop方法（弹栈）

    /**
     * 弹栈的方法，从数组当中往外取元素，每次取出一个元素，栈帧向下移动一位
     * @param obj
     * @return
     */
    public Object pop(){
        if(this.index<=-1){
            System.out.println("栈已经空了！弹栈失败！");
            return null;
        }
        //程序到达这里，说明栈没有空

        System.out.println("弹栈"+elements[index]+"成功，"+"栈帧指向:"+index);
        index--;
        return elements[index+1];
    }
    //栈中少一个元素
    //栈如果空，则弹栈失败
    //

    public static void main(String[] args) {

    }
}
