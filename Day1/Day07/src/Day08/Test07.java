package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 19:45
 */
public class Test07 {
    public static void main(String[] args) {
        //大部分情况下，采用这样的方式创建字符串对象
        String s1="hello";
        String s2="abc";
        //实际上String也是一个类，不属于基本数据类型
        //既然String是一个类，则一定存在构造方法
        String s3=new String("Test1");
        String s4=new String("Test1");
        System.out.println(s3==s4);
        //new了两次，两个对象内存地址，s3保存的内存地址和s4的不同。
        //因此比较两个字符串不能使用双等号。需要使用equals方法。
        //String类已经重写了equals方法。
        System.out.println(s3.equals(s4));

        //如果String没有重写toString方法，则输出的结果含有16进制的地址
        String x=new String("wenxin");
        System.out.println(x.toString());
        //由最后的结果可以得知String有重写toString方法
    }
}
