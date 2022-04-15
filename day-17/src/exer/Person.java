package exer;

/**
 * @author : ljg
 * @ClassName: Person
 * @Description TODO
 * @date : 2022/2/13 12:46
 */
public class Person {
    String name;
    int age;

    public Person() {

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
