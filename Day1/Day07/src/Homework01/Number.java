package Homework01;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Lenovo
 * Date: 2022-06-30
 * Time: 12:11
 */
public class Number {
    private double n1;
    private double n2;

    public Number(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Number() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void addition(){
        double result=n1+n2;
        System.out.println(n1+" + "+n2+" = "+result);
    }
    public void subtraction(){
        double result=n1-n2;
        System.out.println(n1+" - "+n2+" = "+result);
    }
    public void multiplication(){
        double result=n1*n2;
        System.out.println(n1+" * "+n2+" = "+result);
    }
    public void division(){
        double result=n1/n2;
        System.out.println(n1+" / "+n2+" = "+result);
    }
}
