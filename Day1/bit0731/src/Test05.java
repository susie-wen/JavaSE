/**
 * @author Susie-Wen
 * @version 1.0
 * @description:装箱和拆箱
 * @date 2022/7/31 12:35
 */
public class Test05 {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);//true
        System.out.println(c == d);//false
    }

}
