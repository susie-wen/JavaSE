package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 8:30
 */
public class Test03 {
    public static void main(String[] args) {
        A1 a=new D1();
        B1 b=new D1();
        C1 c=new D1();
//      a.m2();//报错，因为A1当中没有m2方法
        B1 bb=(B1)a;//向下转型，则此时不报错
        bb.m2();
    }
}


interface A1{
    void m1();
}

interface B1{
    void m2();
}

interface C1{
    void m3();
}

class D1 implements A1,B1,C1{
    public void m1(){};
    public void m2(){};
    public void m3(){};

}