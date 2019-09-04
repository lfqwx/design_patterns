package design_patterns.structional.bridge;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class Test {
    public static void main(String[] args) {
        DepositAccount depositAccount = new DepositAccount();
        SavingAccount savingAccount = new SavingAccount();

        Bank abc = new ABCBank(depositAccount);
        Bank icbc = new ICBCBank(savingAccount);
        abc.openAccount();
        icbc.openAccount();
    }
}
