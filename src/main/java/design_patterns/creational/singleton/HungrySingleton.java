package design_patterns.creational.singleton;

import java.io.Serializable;

/**
 * @author L.F.Q
 * @date 2019/6/25 22:37
 */
public class HungrySingleton implements Serializable,Cloneable{
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){
        if (null != hungrySingleton){
            throw new RuntimeException("构造器拒绝反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止序列化和反序列化对单例的破坏
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //防止clone破坏单例
        return getInstance();
    }

   
}
