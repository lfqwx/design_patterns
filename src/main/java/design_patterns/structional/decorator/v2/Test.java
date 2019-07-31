package design_patterns.structional.decorator.v2;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 14:24
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        String desc = aBattercake.getDesc();
        int cost = aBattercake.cost();
        System.out.println(desc + ",总计：" + cost);
    }
}
