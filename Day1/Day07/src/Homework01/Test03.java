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
        final Person p=new Person(30);
        p.age=30;//对象内部的数据可以更改
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




