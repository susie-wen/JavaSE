package Homework01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 12:36
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void addSecond(int sec){
        int oldSec=this.getSecond();
        int newSec=oldSec+sec;
        if(newSec<60){
            this.setSecond(newSec);
        }else if(newSec==60){
            this.setSecond(0);
            this.addMinute(1);
        }else{
            this.setMinute(minute+newSec/60);
            this.setSecond(newSec%60);
        }
    }
    public void addMinute(int min){
        minute=minute+min;
    }
    public void addHour(int hou){
        hour=hour+hou;
    }
    public void subSecond(int sec){
        second=second-sec;
    }
    public void subMinute(int min){
        minute=minute-min;
    }
    public void subHour(int hou){
        hour=hour-hou;
    }
    public void display(){
        System.out.println("现在的时间是"+this.getHour()+"时"+this.getMinute()+"分"+this.getSecond()+"分");
    }
}
