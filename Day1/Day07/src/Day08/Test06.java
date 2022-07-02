package Day08;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 18:58
 */
public class Test06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a == b);

        MyTime t1=new MyTime(2022,7,1);
        MyTime t2=new MyTime(2022,7,1);
        System.out.println(t1==t2);

        boolean flag=t1.equals(t2);
        System.out.println(flag);

        MyTime t3=new MyTime(2022,7,2);
        boolean flag1=t1.equals(t3);
        System.out.println(flag1);

        MyTime t4=null;
        System.out.println(t1.equals(t4));

    }
}

class MyTime{
    private int year;
    private int month;
    private int day;
    public MyTime(){

    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //重写toString方法，为了能够打印出的是日期而非内存地址
    @Override
    public String toString() {
        return this.year+"年"+this.month+"月"+this.day+"日";
    }

    //重写Object类的equals方法
    //比较两个类的年月日
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }//空指针直接返回
        if(!(obj instanceof MyTime)){
            return false;
        }//如果obj不是一个MyTime，就没有必要比较了，直接返回false
        if(this==obj){
            return true;
        }//如果两者内存相同，则直接返回
        //内存地址相同的时候指向的堆内存的对象一定是同一个
        //如果程序执行到此处，则说明obj不是null,obj是MyTime类型
        MyTime t=(MyTime)obj;//直接向下转型
        return (this.year==t.year && this.day==t.day && this.month==t.month);
    }
}
