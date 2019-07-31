package design_patterns.creational.prototype.abstractprototype;

/**
 * @author L.F.Q
 * @date 2019/6/28 8:21
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
