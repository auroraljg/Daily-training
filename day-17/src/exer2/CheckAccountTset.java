package exer2;

/**
 * @author : ljg
 * @ClassName: CheckAccountTset
 * @Description 要求：写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
                      额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。
                      使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额。
                      再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。
                      再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。
 * @date : 2022/2/13 12:30
 */
public class CheckAccountTset {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122,20000,0.045,5000);

        acct.withdraw(5000);
        System.out.println("您的账户余额为："+acct.getBalance());
        System.out.println("您的可透支金额为："+acct.getOverdraft());
        acct.withdraw(18000);
        System.out.println("您的账户余额为："+acct.getBalance());
        System.out.println("您的可透支金额为："+acct.getOverdraft());
        acct.withdraw(3000);
        System.out.println("您的账户余额为："+acct.getBalance());
        System.out.println("您的可透支金额为："+acct.getOverdraft());
    }
}
