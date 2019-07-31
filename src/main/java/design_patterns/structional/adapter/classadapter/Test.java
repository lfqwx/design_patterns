package design_patterns.structional.adapter.classadapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 16:53
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
