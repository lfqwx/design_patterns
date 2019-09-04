package design_patterns.structional.bridge;

/**
 * @author 𝓛.𝓕.𝓠
 * 桥接模式：抽象类或者接口的子类可以沿着多个不同的维度扩展,维持组合关系或者聚合关系
 * 优点：可以避免子类过多
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
