/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 10:21
 */
public class Test02 {
    public static void main(String[] args) {
        //通过无参数构造方法创建对象
        Vehicle v=new Vehicle(120,5);
        v.setSize(5);
        v.setSpeed(120);
        System.out.println(v.getSpeed());
        System.out.println(v.getSize());
        //通过有参数的构造方法创建对象
        Vehicle v1=new Vehicle(130,4);
        //调用加速方法
        v.speedUp(20);
        System.out.println("加速后的speed:"+v.getSpeed());
        //调用减速方法
        v.speedDown(10);
        System.out.println("减速后的speed:"+v.getSpeed());
    }
}
