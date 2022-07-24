package enumDemo;

import reflectdemo.Test;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/24 9:15
 */
public enum TestEnum {
    RED,BLACK("red",2),GREEN,WHITE;//枚举对象

    public String color;
    public int ordinal;

    private TestEnum(String color,int ordinal){
        this.color=color;
        this.ordinal=ordinal;
    }
    TestEnum(){
    }

    public static void main(String[] args) {
        //拿到枚举实例BLACK
        TestEnum testEnum = TestEnum.BLACK;
        //拿到枚举实例RED
        TestEnum testEnum21 = TestEnum.RED;
        System.out.println(testEnum.compareTo(testEnum21));
        System.out.println(BLACK.compareTo(RED));
        System.out.println(RED.compareTo(BLACK));
    }
    public static void main2(String[] args) {
        TestEnum[] testEnums=TestEnum.values();
        //TestEnum.values():以数组形式返回枚举类型的所有成员
        for(int i=0;i<testEnums.length;i++){
            System.out.println(testEnums[i]+",序号："+testEnums[i].ordinal());
        }
        System.out.println("========");
        TestEnum testEnum=TestEnum.valueOf("GREEN");//将普通字符串转换为枚举实例
        System.out.println(testEnum);
    }

    public static void main1(String[] args) {
        TestEnum testEnum2 = TestEnum.BLACK;
        switch (testEnum2) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            default:
                break;
        }
    }
}
