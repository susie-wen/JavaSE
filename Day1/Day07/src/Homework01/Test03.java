package Homework01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 13:10
 */
public class Test03 {
    public static void main(String[] args) {
        Person p1=new Person(20);
        System.out.println(p1.age);
        //代码无论怎么变化，P也是一个变量（只不过它有一个特殊的名字：引用）
        final Person p=new Person(30);
        p=new Person(29);//错误：无法为最终变量P分配值
    }
}

class Person{
    int age;
    public Person(){
    }
    public Person(int age){
        this.age=age;
    }
}

final class A{
    public final void doSome(){
        System.out.println("doSome");
    }
}



