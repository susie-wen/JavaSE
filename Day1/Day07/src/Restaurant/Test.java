package Restaurant;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 9:52
 */
public class Test {
    public static void main(String[] args) {
        //创建厨师对象(多态)
        FoodMenu menu1=new ChinaCooker();
        FoodMenu menu2=new AmericanCooker();
        //创建顾客对象
        Customer m1=new Customer(menu1);
        Customer m2=new Customer(menu2);
        //顾客点菜
        m1.order();
        m2.order();

    }
}
