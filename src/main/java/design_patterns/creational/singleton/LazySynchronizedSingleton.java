package design_patterns.creational.singleton;

import design_patterns.annotation.ThreadSafe;

/**
 * @author L.F.Q
 * @date 2019/6/25 15:08
 */
@ThreadSafe
public class LazySynchronizedSingleton {
    private static LazySynchronizedSingleton lazySingleton;

    private LazySynchronizedSingleton(){}

    public synchronized static LazySynchronizedSingleton getLazySingleton() {
        if (null == lazySingleton) {
            lazySingleton = new LazySynchronizedSingleton();
        }
        return lazySingleton;
    }
}
