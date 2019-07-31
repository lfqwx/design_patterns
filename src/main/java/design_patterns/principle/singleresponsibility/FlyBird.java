package design_patterns.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/24 12:12
 */
@Slf4j
public class FlyBird {
    public void mainMove(String name) {
      log.info("\n"+name+"飞翔。。。");
    }
}
