/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-04
 * Time: 8:02
 */
public class Test01 {
    public static void main(String[] args) {
        MyInt myInt=new MyInt(100);
        doSome(myInt);
    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
