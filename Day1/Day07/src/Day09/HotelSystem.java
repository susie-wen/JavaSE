package Day09;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-07-03
 * Time: 18:01
 */
public class HotelSystem {
    public static void main(String[] args) {

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下说明：");
        System.out.println("请输入对应的功能编号：【1】查看房间列表。【2】订房。【3】退房。【0】退出系统");
        Scanner s=new Scanner(System.in);

        Hotel hotel=new Hotel();
        while(true){
            System.out.print("请输入功能编号:");
            int i=s.nextInt();

        if(i==1){
            //查看房间列表
            hotel.print();

        }else if(i==2){
            //订房
            System.out.print("请输入要订房的房间号码：");
            int numNo=s.nextInt();
            hotel.order(numNo);
        }else if(i==3){
            //退房
            System.out.print("请输入要退房的房间号码：");
            int numNo=s.nextInt();
            hotel.exit(numNo);
        }else if(i==0){
            //退出系统
            System.out.print("已退出系统");
            return;
        }else {
            System.out.print("输入错误，请重新输入:");
        }

       }
    }
}
