package design_patterns.structional.adapter.classadapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 16:52
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
