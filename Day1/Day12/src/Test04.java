/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-04
 * Time: 9:38
 */
import java.text.*;
import java.util.Date;
public class Test04 {
    public static void main(String[] args) throws Exception {
/*        //        将一个日期字符串String转换成Date类型
        String time="2022-07-04 09:33:00 272";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime=sdf3.parse(time);
        System.out.println(dateTime);*/

        //统计一个方法的耗时
        //在调用目标方法之前记录一个毫秒数
        long begin=System.currentTimeMillis();
        print();
        //在执行完目标方法之后记录一个毫秒数
        long end=System.currentTimeMillis();
        System.out.println("print方法耗费时长："+(end-begin)+"毫秒");
    }

    public static void print(){
        for(int i=0;i<1000000000;i++){
            ;
        }
    }
}
