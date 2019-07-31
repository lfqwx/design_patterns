package design_patterns.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/24 12:13
 */
@Slf4j
public class WalkBird  {
    public void mainMove(String name) {
      log.info("\n"+name+"走路。。。");
    }
}
