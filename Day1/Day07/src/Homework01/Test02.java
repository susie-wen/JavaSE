package Homework01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 12:40
 */
public class Test02 {
    public static void main(String[] args) {
        MyTime m=new MyTime();
        m.setHour(10);
        m.setMinute(20);
        m.setSecond(30);
        m.display();
        m.addHour(1);
        m.addMinute(2);
        m.addSecond(113);
        m.display();
    }
}
