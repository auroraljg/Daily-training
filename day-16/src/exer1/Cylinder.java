package exer1;

/**
 * @author : ljg
 * @ClassName: Cylinder
 * @Description TODO
 * @date : 2022/2/12 17:31
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        length =1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //返回圆柱体的体积
    public double findvolume(){
        return findArea()*getLength();
    }
}
