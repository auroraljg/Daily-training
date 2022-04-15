package exer2;

/**
 * @author : ljg
 * @ClassName: Student
 * @Description TODO
 * @date : 2022/2/12 18:26
 */
public class Student extends Person{
    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }
    public void study(){
        System.out.println("学习，专业是"+major);
    }
    //对父类方法的重写
//    public void eat(){
//        System.out.println("学生应该吃有营养的食物");
//    }

    public void eat() {
        System.out.println("学生应该吃有营养的食物");
    }
}
