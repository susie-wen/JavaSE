package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 22:23
 */
public class Test10 {
    public static void main(String[] args) {
        //方法一：写一个接口的实现类Com
        MyMath1 m=new MyMath1();
        m.sum(new Com(),100,200);

        //方法二：使用匿名内部类，这样就不需要写一个接口的实现类了，直接在此处实现接口的抽象方法即可
        MyMath1 mm=new MyMath1();
        mm.sum(new Com(){
            public int sum(int x,int y){
                return x+y;
            }
        },100,200);
    }
}

//负责计算的接口
interface Computer{
    int sum(int a,int b);
}
//实现接口的类
class Com implements Computer{
    public int sum(int a,int b){
        return a+b;
    }
}
class MyMath1{
    public void sum(Computer c,int x,int y){
        int r=c.sum(x,y);
        System.out.println(x+"+"+y+"="+r);
    }
}














