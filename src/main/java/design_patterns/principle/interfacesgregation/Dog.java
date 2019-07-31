package design_patterns.principle.interfacesgregation;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/24 13:33
 */
@Slf4j
public class Dog implements ISwimAnimal {
    @Override
    public void swim() {
      log.info("\n游泳。。。");
    }
}
