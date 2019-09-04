package design_patterns.structional.bridge;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开农业银行账号");
        account.openAccount();
        return account;
    }
}
