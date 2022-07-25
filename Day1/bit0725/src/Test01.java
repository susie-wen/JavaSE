import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/25 9:13
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("hello");
        list.add("you");
        list.add("are");
        list.add("how");
        list.add("lambda");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(s-> System.out.println(s));
    }
}
