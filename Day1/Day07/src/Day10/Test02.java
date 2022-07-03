package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 20:36
 */
public class Test02 {
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="abcdef"+"xy";
        //凡是双引号括起来的都在字符串常量池当中有一份
        //new对象的时候一定在堆内存当中开辟空间
        String s3=new String("xy");
    }
}
