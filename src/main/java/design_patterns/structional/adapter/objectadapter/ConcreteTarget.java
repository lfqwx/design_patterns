package design_patterns.structional.adapter.objectadapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 16:51
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("目标类的方法！");
    }
}
