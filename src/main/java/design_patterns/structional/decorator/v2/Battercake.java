package design_patterns.structional.decorator.v2;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 14:23
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼一个";
    }

    @Override
    protected int cost() {
        return 1;
    }
}
