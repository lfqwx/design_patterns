package design_patterns.creational.singleton;

/**
 * @author L.F.Q
 * @date 2019/6/26 14:39
 */
public class ThreadLocalSingleton {
    private final static ThreadLocal<ThreadLocalSingleton> threadLocal
            = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return ThreadLocalSingleton.threadLocal.get();
    }

}
