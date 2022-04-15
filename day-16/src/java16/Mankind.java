package java16;

/**
 * @author : ljg
 * @ClassName: Mankind
 * @Description成员变量int sex和int salary；
 * 方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
 * 方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
 * @date : 2022/2/12 16:54
 */
public class Mankind {
    private int sex;//性别
    private int salary;//工资

    public Mankind(){

    }
    public Mankind(int sex,int salary){
        this.salary=salary;
        this.sex=sex;
    }

    public int getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    void manOrWoman(){
        if(sex==1){
            System.out.println("man");
        }else{
            System.out.println("woman");
        }
    }
    void employeed(){
//        if(salary==0){
//            System.out.println("no job");
//        }else{
//            System.out.println("job");
//        }
        String jodInfo = (salary == 0)? "no jod" : "jod";
        System.out.println(jodInfo);
    }

}
