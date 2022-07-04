/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-04
 * Time: 9:56
 */
public class String1 {
    public static void main(String[] args) {
        //创建一个初始化容量为16的byte数组。（字符串缓冲区对象）
        StringBuffer string1=new StringBuffer();
        //拼接字符串，以后拼接字符串统一调用append方法
        string1.append("a");
        string1.append("b");
        string1.append("c");
        string1.append(3.14);
        //append方法底层在进行追加的时候，如果byte数组满了，就会自动扩容
        System.out.println(string1.toString());

        //指定初始化容量的StringBuffer对象
        StringBuffer s=new StringBuffer(100);
    }
}
