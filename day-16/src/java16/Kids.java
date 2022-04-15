package java16;

/**
 * @author : ljg
 * @ClassName: Kids
 * @Description 定义类Kids继承ManKind，并包括
 * 成员变量int yearsOld；
 * 方法printAge()打印yearsOld的值。
 * @date : 2022/2/12 17:03
 */
public class Kids extends Mankind{
    private int yearsOld;

    public Kids(){

    }
    public Kids(int yearsOld){
        this.yearsOld=yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am,"+yearsOld+" years old.");
    }
}
