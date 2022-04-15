package java16;

/**
 * @author : ljg
 * @ClassName: Person
 * @Description TODO
 * @date : 2022/2/12 16:46
 */
public class Person {
    String name;
    char sex;
    int age;

    public Person (String name,char sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
