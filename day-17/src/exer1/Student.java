package exer1;

import java.lang.reflect.GenericArrayType;

/**
 * @author : ljg
 * @ClassName: Student
 * @Description TODO
 * @date : 2022/2/13 10:39
 */
public class Student extends Person{
    String major;
    int id=1002;//学号

    public Student() {
        super();//默认带一个父类的空参构造器
    }

    public Student(String major, int id) {
        super();
        this.major = major;
        this.id = id;
    }

    public Student(String name, int age, String major, int id) {
        super(name, age);//调用父类的构造器
        this.major = major;
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("学生，多吃有营养的东西");
    }
    public void study() {
        System.out.println("学生，学习知识");
    }

    public void show() {
        System.out.println("name"+this.name+",age="+super.age);
        System.out.println("id="+id);//默认是本类的id
        System.out.println("id="+super.id);
    }

}
