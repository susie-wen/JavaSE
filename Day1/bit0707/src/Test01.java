/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/7 9:06
 */
public class Test01 {
    public static void main(String[] args) {
        String s="(}(([[[((]]]()[[[]]))){{{{}}}";
        System.out.println("原始的s:"+s);
        s=s.replace("()","");
        System.out.println("新的替换了()的s:"+s);
        s=s.replace("[]","");
        System.out.println("新的替换了[]的s:"+s);
        s=s.replace("{}","");
        System.out.println("新的替换了{}的s:"+s);
    }
}
