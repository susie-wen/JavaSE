import java.util.Set;
import java.util.TreeSet;


/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/21 14:17
 */
public class Test02 {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("abc");
        set.add("abc");
        set.add("abc");
        set.add("abc");
        System.out.println(set);
    }
}
