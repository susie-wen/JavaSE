import java.util.Scanner;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:javase期末卷子第一题
 * @date 2022/7/15 10:53
 */
public class Test {
    public static String func(String s){
        int[] array=new int [255];
        //定义一个数组相当于哈希表，查询字符是否被使用过
        StringBuilder stringBuilder=new StringBuilder();
        //遍历字符串当中的每一个字符
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(array[ch]==0){
                stringBuilder.append(ch);
                array[ch]=1;
                //之前是0的改成1
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()){
            String str=scan.nextLine();
            String ret=func(str);
            System.out.println(ret);
        }
    }
}
