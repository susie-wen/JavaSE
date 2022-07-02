package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 18:58
 */
public class Test05 {
    public static void main(String[] args) {
        //拷贝源（从这个数组中拷贝）
        int[] src={1,11,22,34};
        //拷贝目标（拷贝到这个目标数组上）
        int[] dest=new int[20];//动态初始化一个长度为20的数组，每一个元素的默认值是0
        //调用JDK当中System类中的arraycopy方法，来完成数组的拷贝
        System.arraycopy(src,1,dest,3,2);
        //遍历目标数组
        for(int i=0;i<dest.length;i++){
            System.out.print(dest[i]);
        }

        //数组中如果存储的元素是引用，也是可以拷贝的。
        String[] str={"hello","world","study","java"};
        String[] newstr=new String[20];
        System.arraycopy(str,0,newstr,0,4);
        for(int i=0;i<newstr.length;i++){
            System.out.print(newstr[i]+" ");
        }

        Object[] o={new Object(),new Object(),new Object()};
        Object[] newObjs=new Object[10];
        //这里拷贝的是对象的地址，而不是对象
        System.arraycopy(o,0,newObjs,0,o.length);
    }
}

