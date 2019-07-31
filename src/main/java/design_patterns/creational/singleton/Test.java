package design_patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;


/**
 * @author L.F.Q
 * @date 2019/6/25 15:10
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        log.info("\n 完事了。。。");


//        EnumSingleton instance = EnumSingleton.getInstacne();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EnumSingleton.txt"));
//
//        oos.writeObject(instance);
//        oos.close();
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EnumSingleton.txt"));
//        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
//        ois.close();
//        log.info("\n"+instance);
//        log.info("\n"+newInstance);
//        System.out.println(newInstance==instance);

//        Class<?> objectClass = EnumSingleton.class;
//        EnumSingleton instance = EnumSingleton.getInstacne();
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumSingleton newInstance = (EnumSingleton)constructor.newInstance("lfq",666);
//
//        log.info("\n"+instance);
//        log.info("\n"+newInstance);
//        System.out.println(newInstance==instance);

//        EnumSingleton instacne = EnumSingleton.getInstacne();
//        instacne.printTest();
    }
}
