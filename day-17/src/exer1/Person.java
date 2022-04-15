package exer1;

/**
 * @author : ljg
 * @ClassName: Person
 * @Description TODO
 * @date : 2022/2/13 10:39
 */
public class Person {
    String name;
    int age;
    int id=1001;//身份证号
    public Person() {
        System.out.println("******************************");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("人，吃饭");
    }
    public void walk(){
        System.out.println("人，走路");
    }
}
