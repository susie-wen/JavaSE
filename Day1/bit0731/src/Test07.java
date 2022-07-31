import java.util.ArrayList;
import java.util.List;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/31 20:17
 */
public class Test07 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("JavaSE");
        list.add("JavaEE");
        list.add("JavaWeb");
        list.add("JVM");
        list.add("123");
        System.out.println(list);
        List<String> ret=list.subList(1,3);
        System.out.println(ret);
        System.out.println("===更新===");
        ret.set(0,"更新后");
        System.out.println(list);
        System.out.println(ret);
    }
}
