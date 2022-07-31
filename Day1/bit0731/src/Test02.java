/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 9:58
 */
class Message1<T>{
    private T message;
    public T getMessage(){
        return message;
    }
    public void setMessage(T message){
        this.message=message;
    }
}
public class Test02 {
    public static void main(String[] args) {
        Message<String> message = new Message() ;
        message.setMessage("比特就业课欢迎您");
        fun(message);

        Message<Integer> message1=new Message<>();
        message1.setMessage(10);
        fun(message1);
    }
    public static void fun(Message<?> temp){
        //形参使用通配符，则无法实参传递的是什么类型，都可以匹配上
        System.out.println(temp.getMessage());
    }
}
