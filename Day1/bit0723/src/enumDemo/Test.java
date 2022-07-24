package enumDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 9:59
 */
public class Test {
    public static void reflectPrivateConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c=Class.forName("enumDemo.TestEnum");
        Constructor<?> constructor=c.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        TestEnum testEnum=(TestEnum) constructor.newInstance("香槟红",9);
        System.out.println(testEnum);
    }
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        reflectPrivateConstructor();
    }
}
