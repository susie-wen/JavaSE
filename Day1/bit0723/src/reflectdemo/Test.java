package reflectdemo;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/23 23:08
 */
class Student{
    //私有属性name
    private String name = "张三";
    //公有属性age
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }

    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }

    private void eat(){
        System.out.println("i am eat");
    }

    public void sleep(){
        System.out.println("i am pig");
    }

    private void function(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //第一种获取class对象的方式
        Class<?> c1=Class.forName("reflectdemo.Student");//forName里面写上Student类的全路径
        //第二种获取class对象的方式
        Student student=new Student();
        Class<?> c2=student.getClass();
        //第三种获取class对象的方式
        Class<?> c3=Student.class;
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c3==c2);
        //上面三行输出的结果都相同，说明获取class对象只有一个
        //一个类对应的一个class对象
    }
}
