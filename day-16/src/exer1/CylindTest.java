package exer1;

/**
 * @author : ljg
 * @ClassName: CylindTest
 * @Description TODO
 * @date : 2022/2/12 17:35
 */
public class CylindTest {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findvolume();
        System.out.println("圆柱的体积："+ volume);
        double area=cy.findArea();
        System.out.println("底面圆的面积："+ area);
    }
}
