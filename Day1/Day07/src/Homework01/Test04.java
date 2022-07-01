package Homework01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 19:13
 */
public class Test04 {
}

//银行账户类
abstract class Account{
}

//信用卡类,子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account{
}

//抽象类的子类还可以是抽象类
abstract class Credit extends Account{
}

class User{
    final int b;
    public User(){
        this.b=80;
    }
}

