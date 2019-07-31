package design_patterns.creational.prototype.clone;

import design_patterns.creational.singleton.HungrySingleton;

import java.lang.reflect.Method;

/**
 * @author L.F.Q
 * @date 2019/6/28 8:26
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇", birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        System.out.println("--------------");
//
//        pig1.getBirthday().setTime(11111L);
//        System.out.println(pig1);
//        System.out.println(pig2);

        HungrySingleton instance = HungrySingleton.getInstance();
        Method method = instance.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton instance2 = (HungrySingleton) method.invoke(instance);
        System.out.println(instance);
        System.out.println(instance2);
    }
}
