package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 7:24
 */
public class Test01 {
    public static void main(String[] args) {
        //使用多态，父类型引用指向子类型对象
        //Bird不是抽象类，可以创建对象，向上转型
        Animal a=new Bird();//面向抽象编程
        a.move();
        //在编译的时候，a会检查Animal当中的move方法
        //在执行的时候，a会使用Bird当中的move方法
    }
}

abstract class Animal{
    public abstract void move();
}

class Bird extends Animal{
    //将抽象类当中的抽象方法进行重写
    public void move(){};
}
