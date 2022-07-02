package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 18:21
 */
public class Test04 {
    public static void main(String[] args) {
        Animal a1 =new Animal();
        Animal a2 =new Animal();
        Animal[] animals={a1,a2};

        //对Animal数组进行遍历
        for(int i=0;i< animals.length;i++){
            /*Animal a=animals[i];
            a.move();*/
            //将上面的两行代码进行合并
            animals[i].move();
            //这个move方法是Animal对象当中的move()方法
        }

        //动态初始化一个长度为2的Animal类型数组
        Animal[] aa=new Animal[4];
        //创建一个Animal对象，放到数组的第一个盒子当中
        aa[0]=new Animal();
        //Animal数组中只能存放Animal类型，不能存放Product类型
        //但由于Cat类是Animal的子类，因此可以存放Cat类型
        aa[1]=new Cat();
        Animal[] bb={new Cat(),new Bird(),new Animal()};
        //该数组当中存储了两个对象的内存地址
        //如果调用的方法是父类中存在的方法，则不需要向下转型，直接使用父类型引用即可
        for(int i=0;i<bb.length;i++){
            Animal an=bb[i];
            an.move();

            //如果调用子对象特有的方法，则需要向下转型
            if(bb[i] instanceof Cat){
                Cat cat=(Cat) bb[i];
                cat.catchMouse();
            }

            if(bb[i] instanceof Bird){
                Bird bird=(Bird) bb[i];
                bird.sing();
            }


        }
    }
}
class Animal{
    public void move(){
        System.out.println("Aniaml move....");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("走猫步!");
    }
    public void catchMouse(){
        System.out.println("抓老鼠!");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("鸟在飞!");
    }
    public void sing(){
        System.out.println("鸟在唱歌!");
    }
}









