package exer1;

/**
 * @author : ljg
 * @ClassName: Circle
 * @Description TODO
 * @date : 2022/2/12 17:23
 */
public class Circle {
    private double radius;//半径

    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //返回圆的面积
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
