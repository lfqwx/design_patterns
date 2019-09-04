package design_patterns.structional.bridge;

/**
 * @author 𝓛.𝓕.𝓠
 * 定期账号
 */
public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开一个定期账号");
        return null;
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
