package Day10;

import java.nio.charset.StandardCharsets;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 21:06
 */
public class Test04 {
    public static void main(String[] args) {
/*

        //1、char charAt(int index)
        char c="中国人".charAt(1);
        System.out.println(c);

        //2、int compareTo(String anotherString)
        int result="abc".compareTo("abc");
        System.out.println(result);

        int result2="abcd".compareTo("abce");
        System.out.println(result2);//-1
        int result3="abce".compareTo("abcd");
        System.out.println(result3);//1

        //3、boolean contains(CharSequence s)
        //判断前面的字符串是否包含后面的子字符串
        System.out.println("hello.java".contains(".java"));

        //4、boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".java"));

        //5、boolean equals(Object anObject)
        //比较两个字符串必须使用equals方法，不能使用==
        System.out.println("abc".equals("abc"));

        //6、boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("ABC".equalsIgnoreCase("abc"));*/
/*
        //7、byte[] getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes="abcdef".getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }

        //8、int indexOf(String str)
        //判断某个字符串在当前字符串中第一次出现的索引
        System.out.println("abwjaojavaeajfeaf".indexOf("java"));

        //9、boolean isEmpty()
        //判断某个字符串是否为空字符串
        String a="";
        System.out.println(a.isEmpty());

        //10、int length()
        //判断数组长度是length属性，判断字符串长度是length（）方法

        //11、int lastIndexOf(String str)
        //判断某个字符串在当前字符串中最后一次出现的索引
        System.out.println("dsfnisnirsjavashvljava".lastIndexOf("java"));

        //12、String replace(CharSequence target,CharSequence replacement)
        //String的父接口就是：CharSequence
        //替换字符串
        String s="http://www.baidu.com".replace("http://","https://");
        System.out.println(s);*/

        //13、String[] split(String regex)
        //拆分字符串
/*        String[] ymd="1980-1-11".split("-");
        for(int i=0;i< ymd.length;i++){
            System.out.println(ymd[i]);
        }

        //14、 Boolean startWith(String prefix)
        //判断某个字符串是否以某个子字符串开始
        System.out.println("czcldncscsfz".startsWith("csc"));

        //15、String substring(int beginIndex)
        //截取字符串
        System.out.println("snfkjnvskgibqp".substring(7));

        //16、String substring(int beginIndex,int endIndex)
        //重载的方法，遵循左闭右开
        System.out.println("snvosnovlea".substring(7,10));*/

/*        //17、char[] toCharArray()
        //将字符串转换成char数组
        char[] chars="我是中国人".toCharArray();
        for(int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }*/

/*        //18、String toLowerCase：字符串转换为小写
        System.out.println("svdnleqqSBVKLEQ".toUpperCase(Locale.ROOT));

        //19、String trim()：去除字符串前后空白
        System.out.println("   wsiug    vsovhw   ".trim());*/

        String s1=String.valueOf(new Customer());
        System.out.println(s1);//没有重写toString方法之前调用的是内存地址
        System.out.println(s1.toString());//
    }
}
class Customer{
    public String toString() {
        return "我是VIP客户！";
    }
}

