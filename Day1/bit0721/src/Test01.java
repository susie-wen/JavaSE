import java.util.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/21 10:54
 */
class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
public class Test01 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();//底层红黑树
        map.put("hello",3);
        map.put("abc",10);
        map.put("hello2",8);
        System.out.println(map.keySet());
/*        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            System.out.println("key:"+entry.getKey()+",val:"+entry.getValue());
        }*/

/*
        Collection<Integer> list=map.values();
        System.out.println(list);//[3, 10, 10]


        System.out.println(map);//map重写了toString方法
        Map<Student,Integer> map2=new TreeMap<>();
        map2.put(new Student(),1);
        System.out.println(map.get("can"));
        System.out.println(map.getOrDefault("can1",100));
        Set<String> set=map.keySet();
        System.out.println(set);//[apple, can, fish]

*//*        Map<String,Integer> map2=new HashMap<>();//底层哈希表
        Set<String> set=new TreeSet<>();//底层红黑树
        Set<String> set2=new HashSet<>();//底层哈希表*//**/
    }
}
