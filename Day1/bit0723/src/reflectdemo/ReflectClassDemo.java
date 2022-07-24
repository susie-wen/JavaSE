package reflectdemo;

import java.lang.reflect.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/23 23:19
 */
public class ReflectClassDemo {

    //通过反射创建对象
    public static void reflectNewInstance(){
        try {
            Class<?> c1=Class.forName("reflectdemo.Student");
            Student student =(Student) c1.newInstance();
            System.out.println(student);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //调用私有构造方法
    public static void reflectPrivateConstructor(){
        try {
            Class<?> c1=Class.forName("reflectdemo.Student");
            Constructor<?> constructor=c1.getDeclaredConstructor(String.class,int.class);//返回所有的私有构造方法
            constructor.setAccessible(true);//确认是否真的要调用该方法
            Student student=(Student)constructor.newInstance("susie",18);//调用私有构造方法
            System.out.println(student);
        } catch (ClassNotFoundException | NoSuchMethodException e) {//捕获异常
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //反射私有属性
    public static void reflectPrivateField(){
        try {
            Class<?> c1=Class.forName("reflectdemo.Student");
            //要修改私有属性，首先需要有对象，因此先创建对象
            Student student=(Student)c1.newInstance();
            Field field=c1.getDeclaredField("name");
            field.setAccessible(true);
            field.set(student,"美羊羊");
            System.out.println(student);
        } catch (ClassNotFoundException  e) {//捕获异常

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void reflectPrivateMethod(){
        try {
            Class<?> c1=Class.forName("reflectdemo.Student");
            //要修改私有属性，首先需要有对象，因此先创建对象
            Student student=(Student)c1.newInstance();//创建一个学生对象
            Method method=c1.getDeclaredMethod("function", String.class);//表示需要调用function方法，并且后面是该刚刚的参数String
            method.setAccessible(true);
            method.invoke(student,"通过反射传参");
        } catch (ClassNotFoundException  e) {//捕获异常

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reflectPrivateMethod();
    }
}
