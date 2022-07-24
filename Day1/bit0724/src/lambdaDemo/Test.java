package lambdaDemo;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 20:32
 */











//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}



//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}

//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}

//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}

//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}


//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}


class Demo{
    void func(){
        System.out.println("=====");
    }
}
public class Test {
    public static void main(String[] args) {
        int a=10;
        new Demo();//匿名对象
        new Demo(){
            @Override
            void func() {
                int c=99;
                c=100;
                System.out.println(c+"重写一下"+a);
            }
        }.func();//跟着花括号就是匿名内部类
    }




    public static void main6(String[] args) {
        MoreParameterReturn moreParameterReturn=(x,y)->x+y;
        //传入参数x和y，返回x+y
        System.out.println(moreParameterReturn.test(1, 2));
    }








    public static void main5(String[] args) {
        OneParameterReturn oneParameterReturn=x->2*x;
        //传入一个参数x，返回其两倍
        System.out.println(oneParameterReturn.test(10));
    }





    public static void main4(String[] args) {
        NoParameterReturn noParameterReturn=()->{return 10;};
        int ret=noParameterReturn.test();//有返回值就需要接收
        System.out.println(ret);
        System.out.println("简化：");
        NoParameterReturn noParameterReturn2=()->10;
        int ret2=noParameterReturn2.test();
        System.out.println(ret2);
    }












    public static void main3(String[] args) {
        MoreParameterNoReturn moreParameterNoReturn=(int a,int b)->{
            System.out.println(a+b);
        };
        moreParameterNoReturn.test(10,20);
        System.out.println("简化：");
        MoreParameterNoReturn moreParameterNoReturn1=(a,b)-> System.out.println(a+b);
        //简化：参数的类型可以省略，但是是两个同时省略
        moreParameterNoReturn1.test(10,30);
    }







    public static void main2(String[] args) {
        OneParameterNoReturn oneParameterNoReturn=(int x)->{
            System.out.println(x);
        };
//      如果只有一个参数，则参数的类型和小括号都可以省略，即（int x）可以变成 x
        oneParameterNoReturn.test(100);
        System.out.println("简化：");
        OneParameterNoReturn oneParameterNoReturn2=x-> System.out.println(x);
        OneParameterNoReturn oneParameterNoReturn3=System.out::println;//方法引用
        oneParameterNoReturn3.test(10);
    }








    public static void main1(String[] args) {
        //1、如果无lambda表达式
        NoParameterNoReturn noParameterNoReturn=new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("测试一下1");
            }
        };
        noParameterNoReturn.test();

        //2、使用lambda表达式
        NoParameterNoReturn noParameterNoReturn2=()-> System.out.println("测试一下2");
        //当test方法里面只有一条语句的时候，可以省略{}
        noParameterNoReturn2.test();//调用

        NoParameterNoReturn noParameterNoReturn3=()->{
            System.out.println("测试一下3");
            System.out.println("测试一下4");
        };
        noParameterNoReturn3.test();
        //()里面写参数，由于test无参，因此里面不用写东西
        //{}里面写test方法里要实现的内容
        //本身还是表示匿名内部类
    }
}
