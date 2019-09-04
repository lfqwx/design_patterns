package design_patterns.structional.bridge;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }
}
