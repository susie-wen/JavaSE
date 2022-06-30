/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 9:19
 */
import java.util.*;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        //`java.lang*;`不需要手动引入，系统自动引入。lang表示java语言的核心类，不需要手动引入。
        //其中String就在lang包当中
        String s="abc";
        System.out.println(s);
        //直接编写以下程序错误，因为Date类没有被自动导入，需要我们手动导入
//      Date d=new Date();

        //在类名之前写上包名
        java.util.Date d=new java.util.Date();

    }
}
