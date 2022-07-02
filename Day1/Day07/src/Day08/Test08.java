package Day08;

import org.w3c.dom.ls.LSOutput;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-01
 * Time: 19:56
 */
public class Test08 {
    public static void main(String[] args) {
        Student s1=new Student(111,"北京二中");
        Student s2=new Student(111,"北京二中");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        Student s3=new Student(222,new String("北京二中"));
        Student s4=new Student(222,new String("北京二中"));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }


}

class Student{
    int no;
    String school;
    public Student(){};
    public Student(int no,String school){
        this.no=no;
        this.school=school;
    }
    //重写toString方法
    public String toString(){
        return "学号："+no+",所在学校："+school;
    }
    //重写equals方法
    //需求：当一个学生的学号相等，并且学校相同的时候，表示同一个学生
    public boolean equals(Object o){
        if(o==null || !(o instanceof Student)){
            return false;
        }
        if(this==o){
            return true;
        }
        Student s= (Student) o;
        if(this.school.equals(s.school) && this.no==s.no){
            return true;
        }
         return false;
    }
}
