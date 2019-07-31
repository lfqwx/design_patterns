package design_patterns.structional.decorator.v2;

import lombok.AllArgsConstructor;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 14:16
 */
@AllArgsConstructor
public class AbstarctDecorator extends ABattercake {
    private ABattercake aBattercake;
    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
