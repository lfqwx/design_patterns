package design_patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/25 15:10
 */
@Slf4j
public class T implements Runnable {
    @Override
    public void run() {
        log.info("\n"+LazyDoubleCheck.getInstance());
    }
}
