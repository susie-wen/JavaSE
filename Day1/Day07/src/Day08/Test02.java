package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 7:42
 */
public class Test02 {
    public static void main(String[] args) {
        MyMath m=new My();
        //面向接口编程（调用接口里面的方法
        int result=m.sub(10,20);
        System.out.println(result);
        int result2=m.sum(1,3);
        System.out.println(result2);
    }
}

//定义接口
interface A{
}

interface B{
}

interface C extends A,B{
}

//我的数学接口
interface MyMath{
    double PI=3.1415926;
    //PI是常量
    int sub(int a,int b);//相减的抽象方法
    int sum(int a,int b);//相加的抽象方法
}

class My implements MyMath{
    public int sub(int x,int y){
        return x-y;
    }
    public int sum(int x,int y){
        return x+y;
    }
}































