package design_patterns.structional.decorator.v2;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 14:19
 */
public class EggDecorator extends AbstarctDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
