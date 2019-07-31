package design_patterns.creational.factorymethod;

/**
 * @author L.F.Q
 * @date 2019/6/24 16:13
 * 由工厂类的子类工厂来决定创建什么对象
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
