package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 8:41
 */
public class Test04 {
    public static void main(String[] args) {
        Flyable f=new Cat();//多态
        f.fly();
        Flyable f1=new Pig();
        f1.fly();
    }
}

//动物类：父类
class Animal1{
}
//可飞翔的接口
interface Flyable{
    void fly();
}

//动物类子类：猫类
//flybale是一个接口，即一对翅膀，通过接口插到猫身上，让猫可以飞翔
class Cat extends Animal1 implements Flyable{
    public void fly(){
        System.out.println("猫猫起飞！");
    }
}

//动物类子类：蛇类
//如果不想让蛇飞，就不实现flyable接口
//没有实现这个接口就表示没有翅膀，那肯定不能飞翔
class Snack extends Animal1{
}

//动物类子类：猪类，想让猪飞，插接口
class Pig extends Animal1 implements Flyable{
    public void fly(){
        System.out.println("猪猪起飞！");
    }
}









