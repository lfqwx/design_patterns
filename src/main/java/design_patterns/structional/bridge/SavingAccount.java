package design_patterns.structional.bridge;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开一个活期账号");
        return null;
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
