package exer;

/**
 * @author : ljg
 * @ClassName: PersonTest
 * @Description 多态性
 * @date : 2022/2/13 12:52
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man= new Man();
        man.eat();
        man.age=25;
        man.earnMoney();
        //**********************************************//
        System.out.println("*****************************************");
        //对象的多态性：父类的引用指向子类的对象(子类的对象赋给父类的引用）
        Person p2 =new Man();
        //多态的使用:虚拟方法调用，调用子父类同名方法，执行的是子类重写的方法
        p2.eat();
        p2.walk();

//        p2.earnMoney();
        Person p3 = new Woman();
    }
}
