package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 10:37
 */
import java.util.*;
public class Test05 {
    public static void main(String[] args) {
        MyTime t=new MyTime(1970,1,1);
        //MyTime类重写toString()方法之前，输出的结果为:Day08.MyTime@5594a1b5
        String s1=t.toString();
        System.out.println(s1);
        System.out.println(t.toString());
        //注意：输出引用的时候，会自动调用toString方法
        System.out.println(t);
    }
}
//class MyTime{
//    private int year;
//    private int month;
//    private int day;
//    public MyTime(){
//
//    }
//
//    public MyTime(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//    //重写toString方法，为了能够打印出的是日期而非内存地址
//    @Override
//    public String toString() {
//        return this.year+"年"+this.month+"月"+this.day+"日";
//    }
//}















