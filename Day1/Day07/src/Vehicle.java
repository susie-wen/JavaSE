/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 10:36
 */
public class Vehicle {
    private double speed;
    private double size;
    public void move(){
        System.out.println("开始运行！");
    }
    public void speedUp(double a){
            this.speed=this.speed+a;
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public void speedDown(double a){
        this.speed=speed-a;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Vehicle() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
