package design_patterns.creational.singleton;

import design_patterns.annotation.ThreadSafe;

/**
 * @author L.F.Q
 * @date 2019/6/25 16:56
 */
@ThreadSafe
public class LazyDoubleCheck {
    private volatile static LazyDoubleCheck lazyDoubleCheck;

    private LazyDoubleCheck() {
    }

    public static LazyDoubleCheck getInstance() {
        if (null == lazyDoubleCheck) {
            synchronized (LazyDoubleCheck.class) {
                if (null == lazyDoubleCheck) {
                    lazyDoubleCheck = new LazyDoubleCheck();
                    /**
                     * 可能发生指令重排序，导致重复创建对象：2与3
                     * 1.申请空间
                     * 2.初始化
                     * 3.返回引用地址给lazyDoubleCheck
                     *
                     * 解决办法；volatitle
                     */
                }
            }
        }
        return lazyDoubleCheck;
    }
}
