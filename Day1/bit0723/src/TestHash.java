import java.util.HashMap;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/23 17:13
 */
class Person{
    public String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id"+id;
    }


}
public class TestHash {
    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap<>();
        Person person1=new Person("1234");
        Person person2=new Person("9876");
        //如果没有重写hashCode方法，默认会调用父类的方法
        //而对于默认的哈希值，如果id号相同，哈希值也不一样，但是我们想要一样，因此重写hashCode方法
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
    public static void main1(String[] args) {
        HashBack hashBack=new HashBack();
        hashBack.put(2,110);
        hashBack.put(3,111);
        hashBack.put(14,116);
        hashBack.put(5,11);
        hashBack.put(6,11);
        hashBack.put(7,11);
        hashBack.put(8,10);
        hashBack.put(9,10);
    }

}
