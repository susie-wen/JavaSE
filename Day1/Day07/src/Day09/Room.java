package Day09;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:酒店的房间
 * User: Lenovo
 * Date: 2022-07-02
 * Time: 20:48
 */

import java.util.Objects;
import java.util.Scanner;

/**
 * 酒店的房间
 */
public class Room {
    /**
     * 房间编号:int no
     * 1楼：101  102  103...
     * 2楼：201  202  203...
     * 3楼：301  302  303...
     * ...
     */
    private int no;
    /**
     * 房间类型：标准间，单人间，总统套房
     * String type
     */
    private String type;
    /**
     * 房间状态
     * true：表示空闲，房间可以被预定
     * false：表示占用，房间不能被预定
     * boolean status
     */
    private boolean status;
    //构造方法
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public Room() {
    }
    //set和get方法
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法重写

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no && status == room.status && Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, type, status);
    }


    //toString方法重写


    @Override
    public String toString() {
        return "[" + "房间编号：" + no + ", 房间类型：'" + type  + ", 房间状态：" + status + ']';
    }


}
