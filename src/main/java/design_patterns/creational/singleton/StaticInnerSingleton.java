package design_patterns.creational.singleton;

import design_patterns.annotation.ThreadSafe;

/**
 * @author L.F.Q
 * @date 2019/6/25 21:48
 *
 * 线程1和线程2都会去拿取Class初始化锁，谁拿到就初始化内部类里面的单例对象
 * 底层类加载器用到了synchronized锁
 */
@ThreadSafe
public class StaticInnerSingleton {
    /**
     * 一定要记得声明私有构造器
     */
    private StaticInnerSingleton(){
        if (null != InnerSingleton.staticInnerSingleton) {
            throw new RuntimeException("禁止反射创建对象");
        }
    }
    private static class InnerSingleton{
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }
    public static StaticInnerSingleton getSingleton(){
        return InnerSingleton.staticInnerSingleton;
    }
}
