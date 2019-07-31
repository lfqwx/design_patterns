package design_patterns.structional.adapter.objectadapter;


/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 16:52
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
