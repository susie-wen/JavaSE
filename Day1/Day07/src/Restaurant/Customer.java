package Restaurant;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 9:25
 */
//顾客有一个菜单 Customer has a FoodMenu,凡是能够使用has a 来描述的，统一以属性的方式存在
//
public class Customer{
    //面向接口编程
    private FoodMenu foodmenu;//私有化体现封装性，则要提供set和get方法
    public Customer() {
    }
    public Customer(FoodMenu foodmenu) {
        this.foodmenu = foodmenu;
    }
    public FoodMenu getFoodmenu() {
        return foodmenu;
    }
    public void setFoodmenu(FoodMenu foodmenu) {
        this.foodmenu = foodmenu;
    }
    public void order(){
        //方法一：使用get方法拿到菜单
        FoodMenu f=this.getFoodmenu();
        //方法二：直接使用foodmenu，因为私有的属性可以在本类当中使用
        foodmenu.xiHongShiJidan();
        foodmenu.yuXiangRouSi();
    }
}
