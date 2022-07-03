package Day09;

/**
 * Created with IntelliJ IDEA.
 * Description:酒店
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 20:10
 */
public class Hotel {
    /**
     * 二维数组，模拟大厦所有的房间
     * @param args
     */
    private Room[][] rooms;
    public Hotel(){
        //通过构造方法来盖楼层
        rooms=new Room[3][10];//动态初始化，里面每个元素都还是null
        //创建30个room对象，放到数组当中
        for(int i=0;i<rooms.length;i++)
        {
            for(int j=0;j<rooms[i].length;j++){
                if(i==0){
                rooms[i][j]=new Room((i+1)*100+(j+1),"单人间",true);
            }else if(i==1){
                    rooms[i][j]=new Room((i+1)*100+(j+1),"双人间",true);
                }else{
                    rooms[i][j]=new Room((i+1)*100+(j+1),"总统套房",true);
                }
          }
    }

    }

    public void print(){
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms.length;j++){
                Room room=rooms[i][j];
                System.out.println(room);
            }

        }
    }

    /**
     * 订房方法
     * @param roomNo 调用此方法需要传递一个房间编号过来
     * 这个房间编号是前台小姐姐输入的
     */
    public void order(int roomNo){
        //订房主要是将房间对象的status修改为false
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        //把房间状态修改为占用
        room.setStatus(false);
        System.out.println(roomNo+"订房成功！");
    }

    /**
     * 退房
     * @param roomNo
     */
    public void exit(int roomNo){
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(true);
        System.out.println(roomNo+"已经退房！");
    }
}
