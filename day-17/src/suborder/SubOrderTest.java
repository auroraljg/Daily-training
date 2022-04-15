package suborder;

import java17.HelloJava;

import java.util.logging.Handler;

/**
 * @author : ljg
 * @ClassName: SubOrderTest
 * @Description TODO
 * @date : 2022/2/13 10:33
 */
public class SubOrderTest {
    public static void main(String[] args) {
        HelloJava order1=new HelloJava();
        //不同包的非子类，不可以调用private，缺省和protected的属性和方法
        order1.orderPublic=5;
        order1.methodPublic();
    }
}
