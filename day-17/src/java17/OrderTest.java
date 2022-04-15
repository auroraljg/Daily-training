package java17;

/**
 * @author : ljg
 * @ClassName: OrderTest
 * @Description TODO
 * @date : 2022/2/13 10:22
 */
public class OrderTest {
    public static void main(String[] args) {
        HelloJava order=new HelloJava();

        order.orderPublic=11;
        order.orderProtected=12;
        order.orderDefault=13;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的不同类，不可以调用类中私有的属性，方法
//        order.orderPrivate=5;
//        order.methodrivate();
    }
}
