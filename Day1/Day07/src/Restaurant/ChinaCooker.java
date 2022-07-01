package Restaurant;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 9:25
 */

//中餐厨师实现菜单上面的菜。厨师是接口的实现者。
public class ChinaCooker implements FoodMenu{
    public void xiHongShiJidan(){
        System.out.println("中餐中的西红柿炒鸡蛋");
    }
    public void yuXiangRouSi(){
        System.out.println("中餐中的鱼香肉丝");
    }
}
