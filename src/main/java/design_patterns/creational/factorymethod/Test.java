package design_patterns.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/24 16:19
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        log.info("\n生成的对象为："+javaVideoFactory.getVideo().getClass().getSimpleName());

    }
}
