/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 11:55
 */
class Food {

}
class Fruit extends Food {

}
class Apple extends Fruit {

}
class Banana extends Fruit {

}
class Message<T> { // 设置泛型上限
    private T message ;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

}

public class Test03 {
    public static void main(String[] args) {
        Message<Apple> message = new Message<>() ;
        message.setMessage(new Apple());
        fun(message);

        Message<Banana> message2 = new Message<>() ;
        message2.setMessage(new Banana());
        fun(message2);

    }
    // 此时使用通配符"?"描述的是它可以接收任意类型 ，但是由于不确定类型 ，所以无法修改
    //这里只要是fruit或者fruit的子类即可
    public static void fun(Message<? extends Fruit> temp){
//temp.setMessage(new Banana()); //报错，仍然无法修改！
//temp.setMessage(new Apple()); //报错，仍然无法修改！
//      Banana banana=temp.getMessage();//报错
        Fruit banana1=temp.getMessage();//可以
        System.out.println(temp.getMessage());//可以，获取元素
    }
}





























