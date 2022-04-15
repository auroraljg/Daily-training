package exer;

import java.security.PublicKey;

/**
 * @author : ljg
 * @ClassName: AnimalTest
 * @Description TODO
 * @date : 2022/2/13 17:19
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }
    public void func(Animal animal){//Animal animal= new Dog();多态性
        animal.eat();
        animal.shot();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物，进食");
    }
    public void shot(){
        System.out.println("动物，叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void shot(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shot(){
        System.out.println("喵喵喵");
    }
}