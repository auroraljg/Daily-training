package java16;

/**
 * @author : ljg
 * @ClassName: kidsTest
 * @Description 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问
 * 其父类的成员变量及方法。
 * @date : 2022/2/12 17:17
 */
public class kidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.printAge();
        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.employeed();
        someKid.manOrWoman();
    }
}
