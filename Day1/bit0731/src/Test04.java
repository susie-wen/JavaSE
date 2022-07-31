/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 12:23
 */
public class Test04 {
    public static void main(String[] args) {
        Message<Fruit> message = new Message<>() ;
        message.setMessage(new Fruit());
        fun(message);

        Message<Food> message2 = new Message<>() ;
        message2.setMessage(new Food());
        fun(message2);
    }
    //temp 接收Fruit及其子类的一个Message
    public static void fun(Message<? super Fruit> temp){
// 此时可以修改！   ！添加的是Fruit 或者Fruit的子类
        temp.setMessage(new Apple());//这个是Fruit的子类
        temp.setMessage(new Fruit());//这个是Fruit的本身
//Fruit fruit = temp.getMessage(); 不能接收 ，这里无法确定是哪个父类
        System.out.println(temp.getMessage());//只能直接输出
    }
}
