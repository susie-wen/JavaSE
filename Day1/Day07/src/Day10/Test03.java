package Day10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 20:47
 */
public class Test03 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);//结果是true

        String x=new String("xyz");
        String y=new String("xyz");
        System.out.println(x==y);//结果是false
        System.out.println(x.equals(y));

        String k=new String("testString");
        System.out.println("testString".equals(k));


    }
}
