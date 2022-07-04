/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-04
 * Time: 8:42
 */
public class Test03 {
    public static void main(String[] args) {
/*        //自动装箱：
        Integer x=100;
        //自动拆箱：
        int y=x;*/

/*        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
        Integer c=new Integer(100);
        Integer d=new Integer(100);
        System.out.println(c==d);*/
/*
        Integer a=127;
        Integer b=127;
        System.out.println(a==b);
        Integer c=128;
        Integer d=128;
        System.out.println(c==d);

        //手动装箱
        Integer t=new Integer(1000);
        //手动拆箱
        int t1=t.intValue();
        System.out.println(t1);

        Integer a1=new Integer("宏伟");*/

        int retValue=Integer.parseInt("123");
        System.out.println(retValue+1);
    }
}
