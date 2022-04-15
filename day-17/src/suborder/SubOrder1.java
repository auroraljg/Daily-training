package suborder;

import java17.HelloJava;

/**
 * @author : ljg
 * @ClassName: SubOrder1
 * @Description TODO
 * @date : 2022/2/13 10:29
 */
public class SubOrder1 extends HelloJava {
   public void method(){
       //不同包的子类中，不能调用private，缺省的属性和方法
       orderProtected=55;
       orderPublic=66;

       methodPublic();
       methodProtected();
   }

}
