import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-04
 * Time: 9:18
 */

import java.util.Date;
public class Time {
    public static void main(String[] args) {
        //获取系统当前时间(精确到毫秒)
        //直接调用无参的构造方法
        Date nowTime=new Date();
        System.out.println(nowTime);

/*        //日期格式化
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        SimpleDateFormat sdf1=new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        String nowTime11=sdf.format(nowTime);
        System.out.println(nowTime11);
        String nowTime22=sdf1.format(nowTime);
        System.out.println(nowTime22);*/


    }
}
